package com.springapp1.beans;

public class GreetingsServiceImpl implements GreetingService{
	private String greetingMessage;
	/**
	 * Always write the default constructor 
	 * Reason :: 
	 */
	public GreetingsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor with greetingString to initialize message
	 */
	public GreetingsServiceImpl(String message){
		this.greetingMessage = message;
	}
	
	/**
	 * Intialize with setter message
	 */
	public void setGreetMessage(String greetMessage) {
		this.greetingMessage = greetMessage;
	}
	
	
	@Override
	public void sayGreeting() {
		System.out.println("Hai User"+ this.greetingMessage);
	}

}
