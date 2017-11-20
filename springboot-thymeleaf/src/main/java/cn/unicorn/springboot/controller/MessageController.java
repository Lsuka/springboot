package cn.unicorn.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	@RequestMapping("/message")
	public String echo(Model model,HttpServletRequest request) {
		model.addAttribute("title","<h1>gay里gay起</h1>");
		request.setAttribute("msg", "<h2>啊啊 啊啊啊啊疲れた</h2>");
		return "message/message_show";
	}

}