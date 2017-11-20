package cn.unicorn.springboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.unicorn.springboot.service.IDeptService;

@Controller
public class DeptController {
	@Resource
	private IDeptService deptService;

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("allDepts", this.deptService.list());
		return "pages/demo/dept_list";
	}
}
