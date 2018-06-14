package com.spring.annotation.beans;

import com.spring.annotation.service.FortuneService;

public class BadmintionCoach implements Coach{
	private FortuneService fs;
	
	public BadmintionCoach(FortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String displayDailyWorkout() {
		return "practise running around the court for 30min";
	}

	@Override
	public String displayDailyFortune() {
		return fs.displayFortune();
	}
}
