package cn.unicorn.springboot.config;

import cn.unicorn.springboot.service.impl.MessageServiceImpl;

//@Configuration
public class ServiceConfig {
//	@Bean // 表示在Spring中进行注册处理
	public MessageServiceImpl getMessageServiceInstance() {
		return new MessageServiceImpl();
	}
}
