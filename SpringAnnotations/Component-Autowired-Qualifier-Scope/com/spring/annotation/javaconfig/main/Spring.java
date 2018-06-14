package com.spring.annotation.javaconfig.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.annotation.beans.BadmintionCoach;
import com.spring.annotation.beans.BaseballCoach;
import com.spring.annotation.beans.Coach;
import com.spring.annotation.beans.SwimCoach;
import com.spring.annotation.beans.TabletennisCoach;
import com.spring.annotation.service.FortuneService;
import com.spring.annotation.service.HappyFortuneService;
import com.spring.annotation.service.SadFortuneService;

@Configuration
@ComponentScan("com.spring.annotation.beans,com.spring.annotation.service")
public class Spring {
	@Bean
	public FortuneService happyFortuneService(){ //It allows default/public type method //private access specifier generates error.
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){ //note beanid is : swimCoach
		SwimCoach myswimCoach = new SwimCoach(happyFortuneService());
		return myswimCoach;
	}
	
	@Bean
	public Coach badmintionCoach(){
		BadmintionCoach bc = new BadmintionCoach(new SadFortuneService());
		return bc;
	}
	
	@Bean
	public Coach tabletennisCoach(){
		TabletennisCoach  tc = new TabletennisCoach(new SadFortuneService());
		return tc;
	}
	
}
