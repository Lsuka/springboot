package cn.unicorn.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.unicorn.springboot.dao.IDeptDAO;
import cn.unicorn.springboot.service.IDeptService;
import cn.unicorn.springboot.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}
}
