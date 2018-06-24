package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		//create a student object
		Student theStudent = new Student();
		
		//Map the model data to student object
		theModel.addAttribute("student", theStudent);
		
		return "student-form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent){
		//no need to write the below lines
		/*
		 * Student thestudent = new Student();
		 * student.setFirstName();
		 * student.setLastName();
		 */
		System.out.println("The firstName"+theStudent.getFirstName()+"last name:"+theStudent.getLastName());
		return "student-confirmation";
	}
	
}
