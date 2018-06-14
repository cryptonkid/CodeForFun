package com.spring.annotation.beans;

import com.spring.annotation.service.FortuneService;

public class TabletennisCoach implements Coach {
	private FortuneService fs;
	public TabletennisCoach(FortuneService fs) {
		this.fs = fs;
	}
	@Override
	public String displayDailyWorkout() {
		return "run around the court for 30 min";
	}

	@Override
	public String displayDailyFortune() {
		return fs.displayFortune();
	}

}
