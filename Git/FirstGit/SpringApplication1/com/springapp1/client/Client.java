package com.springapp1.client;

import org.omg.CORBA.portable.ApplicationException;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.springapp1.beans.GreetingService;

/**
 * Important jars to import are spring-core and spring-bean.
 * 
 * @author vivek singh
 *
 */
public class Client {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("SpringApplication1/res/spring.xml"));
		//ApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		// though this is deprecated we are still trying
		
		GreetingService s1 = (GreetingService)factory.getBean("gs1");
		s1.sayGreeting();
		
		GreetingService s2 = (GreetingService)factory.getBean("gs2");
		s2.sayGreeting();
	}

}
