package com.vivek.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.spring.beans.SportsCoach;

public class HelloSpringApp {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springIOC.xml"); 
		//retrive bean from spring container
		//TheCoach theCoach = (TheCoach)context.getBean("myCoach"); 1st way 
		SportsCoach theCoach = context.getBean("badmintionCoach",SportsCoach.class); //2nd way
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		SportsCoach coach2 = context.getBean("squashCoach", SportsCoach.class);
		System.out.println(coach2.getDailyWorkOut());

		//close the context
		context.close();
	}
	
}
