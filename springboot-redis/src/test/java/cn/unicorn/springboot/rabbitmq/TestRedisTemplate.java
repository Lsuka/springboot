package cn.unicorn.springboot.rabbitmq;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.springboot.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class) // 定义要测试的程序类
public class TestRedisTemplate {
	@Resource
	private RedisTemplate<String, String> redisTemple;

	@Test
	public void testSet() {
		this.redisTemple.opsForValue().set("unicorn", "晩御飯どうしても");
	}
}
