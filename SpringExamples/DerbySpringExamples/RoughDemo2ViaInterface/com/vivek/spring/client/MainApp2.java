package com.vivek.spring.client;

import com.vivek.spring.beans.Coach;
import com.vivek.spring.beans.CricketCoach;
import com.vivek.springdemo.beans.BaseballCoach;

public class MainApp2 {
	public static void main(String[] args) {
		//create the object
		
		Coach theCoach = (Coach) new BaseballCoach();
		System.out.println(theCoach.getDailyWorkOut());
		
		theCoach = (Coach) new CricketCoach();
		System.out.println(theCoach.getDailyWorkOut());
		
	}
	//This code is still is not configurable.
	//though now adding new implementaions is easy.
}
