package com.spring.annotation.javaconfig.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.annotation.beans.Coach;
import com.spring.annotation.service.FortuneService;

public class JavaConfigDemoMain {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring.class);
		
		//get the bean
		Coach c3 = context.getBean("badmintionCoach", Coach.class);//NOTE: remove @Lazy tag from cricketCoach bean to see diffrence
		
		//call the method on bean
		System.out.println(c3.displayDailyWorkout());
		System.out.println(c3.displayDailyFortune());
		
		Coach c4 = context.getBean("swimCoach", Coach.class);
		System.out.println(c4.displayDailyWorkout());
		System.out.println(c4.displayDailyFortune());

		Coach c5 = context.getBean("tabletennisCoach", Coach.class);
		System.out.println(c5.displayDailyWorkout());
		System.out.println(c5.displayDailyFortune());
		
		FortuneService f = context.getBean("happyFortuneService",FortuneService.class);
		System.out.println(f.displayFortune());
		//close the context
		context.close();
	}

}
