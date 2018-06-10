package com.vivek.spring.scopedemo.bean;

public class SingletonDemo implements DisplayInfo{
	private String message1;
	private String message2;
	
	public SingletonDemo(){
		System.out.println("Inside constructor of singleton");
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	@Override
	public void display(){
		System.out.printf("message1" +message1 +" message2: "+message2+"\n");
	}
}
