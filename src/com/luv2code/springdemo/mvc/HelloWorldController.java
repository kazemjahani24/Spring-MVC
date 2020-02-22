package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloc")

public class HelloWorldController {
	
	//need a controller method to show html form
	// after writing the method below, we will create the showForm jsp file.
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	// need a controller to process the form and after returning hello world, we will create a jsp file to 
	//process the from
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read data and 
	// add data into the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from html form
		String theName = request.getParameter("studentName");
		
		//convert data into upper case
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo " + theName;
		
		//add that message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
	
		//convert data into upper case
		theName = theName.toUpperCase();
		//create the message
		String result = "Hey my friend version 3 " + theName;
		
		//add that message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
