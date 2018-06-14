package com.spring.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.annotation.service.FortuneService;
import com.spring.annotation.service.SadFortuneService;

@Component
public class BaseballCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService f;
	public BaseballCoach(){
		
	}
	
	/* Uncomment to see :
	 *  Even though Spring.java has sad service wired
	 * 	but still randomFortuneService runs. 
	 * public BaseballCoach(FortuneService sadFortuneService) {
		f = sadFortuneService;
	}*/

	@Override
	public String displayDailyWorkout() {
		return "practise balling for 10 min";
	}

	@Override
	public String displayDailyFortune() {
		return f.displayFortune();
	}

}
