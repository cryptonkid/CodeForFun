package com.vivek.spring.engine;

import com.vivek.spring.engine.CarEngine;

public class DieselEngine implements CarEngine{

	@Override
	public String start() {
		return "Rum Rum Rum....";
	}	

}
