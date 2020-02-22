package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a new student object
		Student theStudent =  new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		/*
			so overall we created our object, added it to the model
			then we did reurn student-form and that will pass it to
			student-form.jsp
		 */
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	
		public String processForm(@ModelAttribute("student") Student theStudent ) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName());
		System.out.println("theStudent: " + theStudent.getLastName());

		return "student-confirmation";
	}

}



