package dataSource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import lombok.Getter;
import mapper.ResultMapperFactory;
import model.ResultTransaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @Author: csc
 * @Description: 抽象不同类型数据的生产者
 * @DateTime: 2024/7/11 17:45
 **/
@Data
public class DataSource{

    private Class<?> type;

    // 当前 Source 的时间戳
    protected long timeStamp;

    protected String time;

    protected int fileIndex = -1;

    protected boolean ended = false;

    protected String cvsSplitBy = ",";

    // 排序时间属性的 index
    protected int timeFieldIndex =  -1;

    @Getter
    protected String[] header;

    protected BufferedReader reader;

    private ObjectMapper mapper = new ObjectMapper();

    // 当前类型数据的数据文件列表
    protected final List<String> files;

    // 设置文件列表，初始化 reader
    public DataSource(List<String> files, int timeFieldIndex, Class<?> type) throws IOException {
        this.files = files;
        this.timeFieldIndex = timeFieldIndex;
        this.type = type;
        this.updateReader();
    }

    // 判断是否还有剩余的文件
    private boolean isLeftFiles(){
        return !(this.fileIndex == this.files.size());
    }

    // 更新 reader 读取下一个文件
    private boolean updateReader() throws IOException {
        if(this.fileIndex + 1< this.files.size()){
            this.reader = new BufferedReader(new FileReader(this.files.get(++fileIndex)));
            // 首行为 header
            this.header = reader.readLine().split(this.cvsSplitBy);
            return true;
        }
        return false;
    }


    // 将 CSV 文件的行数据转换为 json
    private JsonNode csv2Json(String line) {
        String[] values = line.split(this.cvsSplitBy);
        ObjectNode jsonNode = this.mapper.createObjectNode();

        for (int i = 0; i < this.header.length; i++) {
            if (i < values.length) {
                jsonNode.put(this.header[i], values[i]);
            } else {
                jsonNode.put(this.header[i], "");
            }
        }
        return jsonNode;
    }

    // json 2 RawJson
    private String json2RawJson(JsonNode jsonNode) throws JsonProcessingException {
        // json 转化为相应的预处理输出类
        ResultTransaction resultTransaction = ResultMapperFactory.fromJson(jsonNode, this.type);
        assert resultTransaction != null;
        // 预处理输出类转换为原始输入数据
        return resultTransaction.toRawTrans();
    }

    private String getMsg(String line) throws JsonProcessingException {
        JsonNode jsonNode = csv2Json(line);
        return json2RawJson(jsonNode);
    }

    // 根据数据提取时间戳
    private long extractTimestamp(String input){
        // 拆分字符串
        String[] fields = input.split(this.cvsSplitBy);

        // 提取第26个字段
        String timeString = fields[this.timeFieldIndex];

        this.time = timeString;

        // 定义时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            // 解析时间字符串
            LocalDateTime localDateTime = LocalDateTime.parse(timeString, formatter);

            // 将 LocalDateTime 转换为时间戳
            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
            Instant instant = zonedDateTime.toInstant();
            long time = instant.toEpochMilli();

            return time;
        } catch (Exception e) {
            System.out.println("时间字符串格式不正确。");
            e.printStackTrace();
        }

        return -1;
    }

    // 返回下一条数据（json）
    public String getNextMsg() throws IOException {

        if(this.ended) return null;

        String line = reader.readLine();
        // 如果为空，但是还有文件没读，则读取新文件
        if(line == null && isLeftFiles()){
            if(updateReader())  line = reader.readLine();
        }
        if(line == null){
            this.ended = true;
            return null;
        }
        // 更新当前时间戳
        this.timeStamp = extractTimestamp(line);
        // 返回数据
        return getMsg(line);
    }


    @Override
    public String toString() {
        return "DataSource{" +
                "name='" + this.type.getSimpleName() + '\'' +
                '}';
    }


}