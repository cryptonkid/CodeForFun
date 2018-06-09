package com.vivek.spring.beans;

public class SingletonBean implements beanInterface {
	private String schoolName;//constructor based
	private String address; // setter based
	private static int schoolCount;
	//default constructor not initalized.
	public SingletonBean(){
		System.out.println("New School Getting Instansiated");
		schoolCount++;
	}
	public SingletonBean(String schoolName) {
		System.out.println("New School getting Started with name:"+schoolName);
		this.schoolName = schoolName;
		schoolCount++;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private void init(){
		System.out.println("school bean inside init()");
		schoolName = "EMPTY_SCHOOL_NAME";
	}

	private void destroy(){
		System.out.println("bean going through destory()");
		schoolCount = 0;
		schoolName = null;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("The School Details are:");
		System.out.println("[Name]:" + this.schoolName);
		System.out.println("[Address]:" + this.address);
		System.out.println("[No of School registerd]" + schoolCount);
	}
}
