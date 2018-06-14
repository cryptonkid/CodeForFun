package com.spring.annotation.service;

public class SadFortuneService implements FortuneService {

	@Override
	public String displayFortune() {
		return "Ohh... today is a sad day";
	}

}
