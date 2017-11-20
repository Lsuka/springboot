package cn.unicorn.springboot.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerListener {
	@RabbitListener(queues = "unicorn.springboot.queue")
	public void receviveMessage(String msg) {
		System.err.println("[assecpet]" + msg);
	}
}
