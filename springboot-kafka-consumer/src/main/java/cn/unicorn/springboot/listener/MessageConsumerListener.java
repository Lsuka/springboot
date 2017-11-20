package cn.unicorn.springboot.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class MessageConsumerListener {
	@KafkaListener(topics = { "unicorn-springboot" })
	public void receviMessage(ConsumerRecord<String, String> record) {
		System.err.println("[accept]key=" + record.key() + ",value=" + record.value());
	}
}
