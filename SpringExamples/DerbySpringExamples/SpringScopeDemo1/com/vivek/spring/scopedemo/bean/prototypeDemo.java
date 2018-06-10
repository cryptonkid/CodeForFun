package com.vivek.spring.scopedemo.bean;

public class prototypeDemo implements DisplayInfo {
	private String fname;
	private String lname;
	
	public prototypeDemo() {
		System.out.println("Inside the protoTypeDemo");
	}
	@Override
	public void display() {
		System.out.printf("first name:"+fname+" last name:"+lname+"\n");
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
