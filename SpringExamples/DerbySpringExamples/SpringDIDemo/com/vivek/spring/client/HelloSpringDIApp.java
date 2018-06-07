package com.vivek.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.spring.beans.Car;



public class HelloSpringDIApp {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springDI2.xml"); 
		//retrive bean from spring container
		Car hindustanCar = context.getBean("hindustanCar",Car.class);
		
		//Use the car features
		System.out.println(hindustanCar.buyCar());
		System.out.println(hindustanCar.startCar());
		
		
		//retrive bean from spring container
		Car hondaCar = context.getBean("hondaCar", Car.class);
		
		System.out.println(hondaCar.buyCar());
		System.out.println(hondaCar.startCar());
		//close the context
		context.close();
	}
	
}
