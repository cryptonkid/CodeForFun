package com.spring.annotation.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.beans.Coach;

public class AnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Coach c1 = context.getBean("baseballCoach", Coach.class);
		System.out.println(c1.displayDailyFortune());
		System.out.println(c1.displayDailyWorkout());
		
		Coach c2 = context.getBean("cricketCoach", Coach.class);
		System.out.println(c2.displayDailyFortune());
		System.out.println(c2.displayDailyWorkout());
		
		Coach c4 = context.getBean("cricketCoach", Coach.class);
		System.out.println(c4.displayDailyFortune());
		System.out.println(c4.displayDailyWorkout());
		
		Coach c3 = context.getBean("volleyBallCoach", Coach.class);
		System.out.println(c3.displayDailyFortune());
		System.out.println(c3.displayDailyWorkout());
		
		Coach c5 = context.getBean("volleyBallCoach", Coach.class);
		System.out.println(c5.displayDailyFortune());
		System.out.println(c5.displayDailyWorkout());
		
		context.close();
	}
}
