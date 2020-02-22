package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// the annotation below means  this will tell spring tht
@Controller
public class HomeController {

@RequestMapping("/")
public String showPage() {
	
		return "main-menu";
	}
	

}
