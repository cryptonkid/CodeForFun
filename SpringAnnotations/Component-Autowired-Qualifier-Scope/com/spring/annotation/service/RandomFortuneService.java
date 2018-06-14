package com.spring.annotation.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	private Random rd = new Random();
	private String fortune[] ={"hello","good","hai"}; 
	@Override
	public String displayFortune() {
		int index = rd.nextInt(fortune.length);
		return fortune[index];
	}

}
