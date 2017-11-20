package cn.unicorn.springboot.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfucerConfig {
	public static final String EXCHANGE = "unicorn.springboot.exchange";
	public static final String ROUTINGKEY = "unicorn.springboot.routingkey";
	public static final String QUEUE_NAME = "unicorn.springboot.queue";

	@Bean
	public DirectExchange getDriectExchange() {
		return new DirectExchange(EXCHANGE);
	}

	@Bean
	public Queue getQueue() {
		return new Queue(QUEUE_NAME);
	}

	@Bean
	public Binding bindingExchangeQueue(DirectExchange exchange, Queue queue) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);
	}

}
