package cn.unicorn.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Arrays;

import cn.unicorn.springboot.vo.Member;

@Controller
public class MemberController {
	@RequestMapping("/member_show")
	public String show(Model model) {
		Member member = new Member();
		member.setMid("bilibili");
		member.setName("比利");
		member.setDeptno(50L);
		member.setAge(10);
		member.setSalary(10000.0);
		member.setBirthday(new Date());
		model.addAttribute("member", member);
		return "member/member_show";
	}

	@RequestMapping("/member_show_map")
	public String showMap(Model model) {
		Map<String, Member> memberMap = new HashMap<>();
		for (int i = 0; i < 2; i++) {
			Member member = new Member();
			member.setMid("bilibili" + i);
			member.setName("比利" + i);
			member.setDeptno(50L + i);
			member.setAge(10 + i);
			member.setSalary(10000.0 + i);
			member.setBirthday(new Date());
			memberMap.put("member-"+i,member);
		}
		model.addAttribute("memberMap", memberMap);
		return "member/member_show_map";
	}

	@RequestMapping("/member_list")
	public String list(Model model) {
		List<Member> allMembers = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			Member member = new Member();
			member.setMid("bilibili" + i);
			member.setName("比利" + i);
			member.setDeptno(50L + i);
			member.setAge(10 + i);
			member.setSalary(10000.0 + i);
			member.setBirthday(new Date());
			allMembers.add(member);
		}
		model.addAttribute("allMembers", allMembers);
		return "member/member_list";
	}

}