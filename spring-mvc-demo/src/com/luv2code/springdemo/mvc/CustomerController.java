package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringtrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringtrimmer);
	}
	
	@RequestMapping("/showForm")//customer/showForm
	public String showForm(Model theModel){
		theModel.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processCustomer")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResult ){
		if(theBindingResult.hasErrors()){
			return "customer-form";
		}
		System.out.println("Name of customer is :"+theCustomer.getFirstName()+" "+theCustomer.getSecondName());
		System.out.println("number of passes brought: "+theCustomer.getFreePasses());
		System.out.println("postalcode : |"+theCustomer.getPostalCode()+"|");
		System.out.println("coursecode : |"+theCustomer.getCourseCode()+"|");
		System.out.println("topCourseCode : |"+theCustomer.getTopCourseCode()+"|");
		return "customer-confirmation";
	}
}
