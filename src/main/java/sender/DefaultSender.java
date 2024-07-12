package sender;

/**
 * @Author: csc
 * @Description: TODO
 * @DateTime: 2024/7/12 17:13
 **/
public class DefaultSender implements Sender {

    private static DefaultSender defaultSender;

    public DefaultSender() {
    }

    public static DefaultSender getSender() {
        if (defaultSender == null) {
            return new DefaultSender();
        }
        return defaultSender;
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(msg);
    }

    @Override
    public void sendMsg(String key, String msg) {
        System.out.println(msg);
    }

    @Override
    public void sendMsg(String topic, String key, String msg) {
        System.out.println(msg);
    }
}