package com.vivek.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPropClient {
	public static void main(String[] args) {
		// configure container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXmlPropConfig.xml");
		// retrive bean
		User user1 = context.getBean("uinfo", User.class);
		user1.getUserInfo();
		// close contatiner
		context.close();
	}
}
