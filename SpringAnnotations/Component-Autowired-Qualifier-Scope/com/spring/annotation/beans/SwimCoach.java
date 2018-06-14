package com.spring.annotation.beans;

import com.spring.annotation.service.FortuneService;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String displayDailyWorkout() {
		return "Swim for 30 min";
	}

	@Override
	public String displayDailyFortune() {
		return fortuneService.displayFortune();
	}

}
