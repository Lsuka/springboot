package cn.unicorn.springboot.rabbitmq;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.springboot.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class) // 定义要测试的程序类
public class TestRedisConnectionFactory {
	@Resource
	private JedisConnectionFactory connectionFactory;

	@Test
	public void testSet() {
		RedisConnection connection = this.connectionFactory.getConnection();
		System.err.println(connection);
		connection.close();
	}
}
