package com.vivek.springdemo.client;

import com.vivek.springdemo.beans.BaseballCoach;

public class MainApp {
	public static void main(String[] args) {
		//create the object
		BaseballCoach theCoach = new BaseballCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkOut());
				
	}
}
//Rule of thumb Never expose the implementaion/source directly. Hence in next example we will expose interface 