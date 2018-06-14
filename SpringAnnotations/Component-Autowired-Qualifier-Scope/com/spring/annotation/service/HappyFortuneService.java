package com.spring.annotation.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String displayFortune() {
		return "Hello you have a happy day ahead";
	}

}
