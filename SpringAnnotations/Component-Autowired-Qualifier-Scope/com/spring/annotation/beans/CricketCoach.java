package com.spring.annotation.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.annotation.service.FortuneService;

@Component
@Scope("singleton")
@Lazy
public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket Class intialized");
	}
	@Override
	public String displayDailyWorkout() {
		return "practise batting and bowling for 15 min";
	}

	@Override
	public String displayDailyFortune() {
		return fortuneService.displayFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	private void doStartupStuff(){
		System.out.println("CricketCoachBean:: After Creation of bean PostConstruct()method getting called");
	}
	
	@PreDestroy
	private void doCleanupStuff(){
		System.out.println("CricketCoachBean:: Before destruction of bean getting called.");
	}
	
}
