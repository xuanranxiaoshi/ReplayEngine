package dataSource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import sender.Sender;

import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: csc
 * @DateTime: 2024/7/11 19:09
 **/
public class DataManager {

    @Getter
    private int num = 0;

    private PriorityQueue<Record> queue;

    private List<DataSource> dataSources;

    private Sender sender;

    public DataManager(List<DataSource> sources, Sender sender) throws IOException {
        // 初始化字段
        this.dataSources = sources;
        this.sender = sender;
        this.queue = new PriorityQueue<>();
        // 初始化队列: 为每类文件添加一条最早的数据
        for (DataSource dataSource : dataSources) {
            queue.add(new Record(dataSource.getNextMsg(), dataSource.getTimeStamp(),dataSource));
            System.out.println(dataSource + "\t add : " + dataSource.getTime() + " " + dataSource.getTimeStamp());
        }
    }


    public void execute() throws IOException {
        while (!this.queue.isEmpty()){
            Record record = queue.poll();

            DataSource dataSource = record.getDataSource();

            // 发送数据
//            System.out.println(dataSource + "\t send: " + dataSource.getTime() + " " + dataSource.getTimeStamp());
            sendMsg(record.data);

            // 添加新数据
            String nextRecord = dataSource.getNextMsg();
            if(nextRecord != null){
                queue.add(new Record(nextRecord,dataSource.getTimeStamp(),dataSource));
//                System.out.println(dataSource + "\t add : " + dataSource.getTime() + " " + dataSource.getTimeStamp());
            }
        }
    }


    public void sendMsg(String msg){
        num ++;
        sender.sendMsg(msg);
    }

    @AllArgsConstructor
    @Data
    static class Record implements Comparable<Record> {
        private String data;
        private long timeStamp;
        private DataSource dataSource;
        @Override
        public int compareTo(Record o) {
            return (int) (this.timeStamp - o.timeStamp);
        }
    }
}
