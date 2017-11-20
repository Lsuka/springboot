package cn.unicorn.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.unicorn.springboot.vo.Dept;

@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
}
