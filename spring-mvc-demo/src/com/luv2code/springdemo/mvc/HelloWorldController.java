package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processPage() {
		return "helloworld";
	}

	// new controller method to read form data and
	// data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the html form
		String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Yo! " + theName;

		// add the message to model
		model.addAttribute("message", result);

		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
/*
 *This code becomes obsolete as it all done with @RequestParam annotation.
 * 
 * 		// read the request parameter from the html form
		String theName = request.getParameter("studentName");
*/

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "V3 @RequestMapping result! " + theName;

		// add the message to model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
