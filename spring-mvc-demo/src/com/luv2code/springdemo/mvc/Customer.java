package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String secondName;
	
	@Min(value = 2,message="minimum of 2 passes allowed")
	@Max(value = 10,message="Maximum of 10 passes allowed")
	//private int freePasses;		//to make this required field add @NotNull. 
	private Integer freePasses;		//That breaks it as we have primitive type data type
									// Hence convert int to INTEGER //also fix setter and getter methods.
	
	@Pattern(regexp="[a-zA-Z0-9]{5}",message="only 5 char/digit")//Note :: @NotNull is not used hence if all the whitespaces are added this becomes null.
	private String postalCode;
	
	@CourseCode
	private String courseCode; //example of custom validation
	
	@CourseCode(value="TOPS",message="course should start with \"TOPS\" ")
	private String topCourseCode;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getTopCourseCode() {
		return topCourseCode;
	}

	public void setTopCourseCode(String topCourseCode) {
		this.topCourseCode = topCourseCode;
	}

}
