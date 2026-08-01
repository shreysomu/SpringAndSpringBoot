package com.springbootcoredemo2.SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(SpringBootCoreDemo2Application.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

//	@Bean
//	public UserService getUserServiceBean(){
//		return new UserService();
//	}
//	@Bean
//	public JsonParser getJsonParserBean(){
//		return new BasicJsonParser();
//	}
}
