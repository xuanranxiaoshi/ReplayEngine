package sender;

/**
 * @Author: csc
 * @DateTime: 2024/7/12 17:13
 **/
public interface Sender {

    void sendMsg(String msg);

    void sendMsg(String key, String msg);

    void sendMsg(String topic, String key, String msg);
}
