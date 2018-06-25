package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseConstraintValidator.class)//define the helper class
@Target({ElementType.METHOD,ElementType.FIELD}) //define all the target types on which this annotation can be applied
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	//define the attributes and default values
	
	//Defind default value for coursecode
	public String value() default "LUV";
	//define default value for the error
	public String message() default "Must start with LUV";
	//define default groups 
	public Class<?>[] groups() default {};//not there is no default value.
	//define default payload
	public Class<? extends Payload>[] payload() default {};
}
