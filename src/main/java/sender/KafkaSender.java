package sender;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class KafkaSender implements Sender {

    private static KafkaSender kafkaSender;
    private static KafkaProducer kafkaProducer;
    private static String topic = "HighLink";

    private KafkaSender(Properties properties) {
        kafkaProducer = new KafkaProducer(properties);
    }

    public static KafkaSender getSender() {
        if(kafkaSender == null){
            InputStream input = KafkaSender.class.getClassLoader().getResourceAsStream("kafkaBasic.properties");
            Properties properties = new Properties();
            try {
                properties.load(input);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            kafkaSender = new KafkaSender(properties);
        }

        return kafkaSender;
    }

    public static void setTopic(String topic) {
        KafkaSender.topic = topic;
    }

    @Override
    public void sendMsg(String msg) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, null, msg);
        kafkaProducer.send(record);
    }

    @Override
    public void sendMsg(String key, String msg) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, msg);
        kafkaProducer.send(record);
    }

    public void sendMsg(String topic, String key, String msg) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, msg);
        kafkaProducer.send(record);
    }
}

