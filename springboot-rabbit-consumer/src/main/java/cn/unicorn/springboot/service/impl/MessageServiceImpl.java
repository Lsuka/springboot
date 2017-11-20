package cn.unicorn.springboot.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cn.unicorn.springboot.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private RabbitTemplate rabbitTemplate;

	@Override
	public void sendMessage(String msg) {
		this.rabbitTemplate.convertAndSend(msg);

	}

}
