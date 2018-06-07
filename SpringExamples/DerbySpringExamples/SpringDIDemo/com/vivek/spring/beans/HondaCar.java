package com.vivek.spring.beans;

import com.vivek.spring.engine.CarEngine;

public class HondaCar implements Car {
	private CarEngine onBoardEngine; //We are injecting the fortuneTeller object into the Music Coach. 
	
	//public HondaCar(){}

	//Setter based injection
	//"property name will be variable name"
	public void setOnBoardEngine(CarEngine carEngine) {
		onBoardEngine = carEngine;
	}
	@Override
	public String buyCar() {
		return "Congrats on buying the Honda City Car";
	}
	@Override
	public String startCar() {
		return onBoardEngine.start();
	}

}
//Note we want to add another bean or feature in existing bean
// we then use the concept of DI where new feature/property is added without using "new() - operator".

