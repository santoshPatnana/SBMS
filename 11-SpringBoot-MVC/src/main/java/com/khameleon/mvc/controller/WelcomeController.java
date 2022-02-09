package com.khameleon.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping(value="/welcome")
	public String fetchWelcomePage() {
		System.out.println("with in .................");
		return "welcome";
	}

}
