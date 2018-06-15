package com.vivek.spring.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aopdemo.daobeans.AccountDAO;
import com.spring.aopdemo.daobeans.MemberShipDAO;

public class DemoAOPMain {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfi.class);
		//read the bean
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		MemberShipDAO theMembershipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);
		
		//call the bussiness method
		theAccountDAO.addAccount();
		System.out.println("\n================== CALLING OTHER DAO ========= \n");
		theMembershipDAO.addMembershipDAO();
		/*
		 * code shows that @Before is called every time the function is called.
		 * System.out.println("\n call it again \n");
		
		//call the bussiness method		
		theAccountDAO.addAccount();*/
		
		
		
		//close the context
		context.close();
	}

}
