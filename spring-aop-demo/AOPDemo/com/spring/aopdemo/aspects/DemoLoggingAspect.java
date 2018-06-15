package com.spring.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	//@Before("execution(public void addAccount())") //code below executes before the addAccount is called.
	
	//@Before("execution(public void add*())") // runs before addMemberShipDAO() and addAccountDAO()
	
	//@Before("execution(public void com.spring.aopdemo.daobeans.AccountDAO.addAccount())") //only a specific class method's
	/*
	 * Using PointCut Expression: 
	 */
	@Pointcut("execution(* com.spring.aopdemo.dao.beans.*.*(..))")
	private void forDAOPackage(){}
	
	@Before("forDAOPackage()")
	public void beforeAddAccount(){
		System.out.println("---- Executing before Add Method is called. ----");
	}
	
}
/*NOTE:: If the expression is not properly closed or written : then following error is thrown
 * 
 * 
 * nested exception is java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting ')' at character position 0 
 * execution(public void com.spring.aopdemo.daobeans.AccountDAO.addAccount()
 */