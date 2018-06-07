package com.vivek.spring.bean;

public class UserData implements User {
	private String password;
	private String emailId;
	private String userName;

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void getUserInfo() {
		System.out.println("The userName:" + this.userName + " EmailID:" + this.emailId + " password:" + this.password);
	}
}
