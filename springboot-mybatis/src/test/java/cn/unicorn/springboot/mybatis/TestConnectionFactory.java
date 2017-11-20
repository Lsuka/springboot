package cn.unicorn.springboot.mybatis;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.springboot.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class) // 定义要测试的程序类
public class TestConnectionFactory {
	@Resource
	private DataSource dataSource;

	@Test
	public void testConnection() throws Exception {
		System.err.println(this.dataSource.getConnection());
	}
}
