package com.vivek.spring.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring.aopdemo")
public class AOPConfi {

	/*@Bean
	public void accountDAO(){
		AccountDAO ado = new AccountDAO();
	}*/
}
