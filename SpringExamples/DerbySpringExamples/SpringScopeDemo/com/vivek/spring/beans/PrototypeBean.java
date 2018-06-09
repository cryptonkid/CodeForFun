package com.vivek.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PrototypeBean implements beanInterface,BeanPostProcessor {
	
	private String firstName;//setter
	private String nickName;//setter
	private int studentID;
	public PrototypeBean(){
		System.out.println("Student Bean Initialized..");
	}
	public void setFirstName(String firstName) {
		//System.out.println("First Name set"+firstName);
		this.firstName = firstName;
	}

	public void setNickName(String nickName) {
		//System.out.println("Nick Name set"+nickName);
		this.nickName = nickName;
	}
	
	
	@Override
	public void displayInfo() {
		System.out.println("The Student Details are");
		System.out.println("firstName:" + this.firstName);
		System.out.println("secondName:" + this.nickName);
		System.out.println("studentid:"+this.studentID);
	}
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("before initalization:"+beanName);
//		return bean;
//	}
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("after processing"+beanName);
//		//System.out.println("studentid incremented"+((PrototypeBean)bean).studentID);
//		return bean;
//	}

}
