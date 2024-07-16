package dataSource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import model.Records;
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

    private PriorityQueue<Records> queue;

    private List<DataSource> dataSources;

    private Sender sender;

    public DataManager(List<DataSource> sources, Sender sender) throws IOException {
        // 初始化字段
        this.dataSources = sources;
        this.sender = sender;
        this.queue = new PriorityQueue<>();
        // 初始化队列: 为每类文件添加一条最早的数据
        for (DataSource dataSource : dataSources) {
            queue.add(dataSource.getNextRecord());
            System.out.println(dataSource + "\t add : " + dataSource.getTime() + " " + dataSource.getTimeStamp());
        }
    }


    public void execute() throws IOException {
        while (!this.queue.isEmpty()){
            Records record = queue.poll();

            DataSource dataSource = record.getDataSource();

            // 发送数据
            sendMsg(record.getKey(), record.getData());

            // 添加新数据
            Records nextRecord = dataSource.getNextRecord();
            if(nextRecord != null){
                queue.add(nextRecord);
            }
        }
    }


    public void sendMsg(String key, String msg){
        num ++;
        sender.sendMsg(key, msg);
    }

}
