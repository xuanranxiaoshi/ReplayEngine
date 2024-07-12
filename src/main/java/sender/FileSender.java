package sender;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: csc
 * @DateTime: 2024/7/12 17:31
 **/
public class FileSender implements Sender {

    private String filePath;
    private PrintWriter writer;

    public FileSender(String filePath) throws IOException {
        this.filePath = filePath;
        this.writer = new PrintWriter(new FileWriter(filePath, true));
    }

    @Override
    public void sendMsg(String msg) {
        writeToFile(msg);
    }

    @Override
    public void sendMsg(String key, String msg) {
        writeToFile(key + ": " + msg);
    }

    @Override
    public void sendMsg(String topic, String key, String msg) {
        writeToFile("[" + topic + "] " + key + ": " + msg);
    }

    private void writeToFile(String msg) {
        writer.println(msg);
        writer.flush();
    }

    public void close() {
        writer.close();
    }
}