package com.spring.aopdemo.daobeans;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
	public void addMembershipDAO(){
		System.out.println("Adding a member ship DAO");
	}
}
