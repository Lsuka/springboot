package cn.unicorn.springboot.service.impl;

import javax.annotation.Resource;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import cn.unicorn.springboot.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService{
	
	@Resource
	private KafkaTemplate<String, String> kafkaTemplate;
	@Override
	public void send(String msg) {
		this.kafkaTemplate.sendDefault("unicorn-key",msg);
	}

}
