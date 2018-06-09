package com.vivek.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.spring.beans.beanInterface;

public class SpringScopeApp {

	public static void main(String[] args) {
		//
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringScope.xml");
		
		beanInterface schoo11 = context.getBean("school",beanInterface.class);
		//beanInterface school2 =  context.getBean("school",beanInterface.class);
		
		
		beanInterface student1 = context.getBean("student1",beanInterface.class);
		beanInterface student2 = context.getBean("student1",beanInterface.class);
		
		schoo11.displayInfo();
		//school2.displayInfo();
		student1.displayInfo();
		student2.displayInfo();
		
		
		
		//context.registerShutdownHook();
		
	}

}
