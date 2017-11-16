package cn.unicorn.springboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.unicorn.springboot.service.IMessageService;

@Controller
public class MessageController3 {
	@Resource
	private IMessageService messageService;

	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("msg",this.messageService.echo());
		return "message/message_show";
	}

}
