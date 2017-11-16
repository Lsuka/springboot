package cn.unicorn.springboot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.unicorn.springboot.service.IMessageService;

@RestController
public class MessageController2 {
	@Resource
	private IMessageService messageService;

	@RequestMapping("/msg")
	public String welcome() {
		return this.messageService.echo();
	}

}
