package com.spring.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.annotation.service.FortuneService;

@Component
@Scope("prototype")
public class VolleyBallCoach implements Coach {
	private FortuneService f;

	public VolleyBallCoach() {
		System.out.println("volleyball");
	}

	@Autowired	
	public VolleyBallCoach(@Qualifier("happyFortuneService")FortuneService f) {
		System.out.println("volleyball intialized");
		this.f = f;
	}

	@Override
	public String displayDailyWorkout() {
		return "practise volley ball for 15min";
	}

	@Override
	public String displayDailyFortune() {
		return f.displayFortune();
	}

}
