package com.vivek.spring.engine;

public class PetrolEngine implements CarEngine {

	@Override
	public String start() {
		return "silent engine start... no sound";
	}

}
