package com.vivek.spring.beans;

import com.vivek.spring.engine.CarEngine;

public class HindustanCar implements Car {
	private CarEngine engine;
	
	/*public HindustanCar(){
		
	}*/
	public HindustanCar(CarEngine engine){
		this.engine = engine;
	}
	@Override
	public String buyCar() {
		return "Congratulations on Buying the Ambastor Car";
	}

	@Override
	public String startCar() {
		return engine.start();
	}
	

}
