package cn.unicorn.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.springboot.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class) // 定义要测试的程序类
public class TestMessageService {
	static {
		System.setProperty("java.security.auth.login.config",
				"d:/kafka_client_jaas.conf");
	} 
	@Test
	public void testsend() throws Exception{
		Thread.sleep(Long.MAX_VALUE);
	}
}
