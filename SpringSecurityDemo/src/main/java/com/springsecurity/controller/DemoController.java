package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String showLoginPage() {
		return "home";
	}
	
	//add leaders
//	public String showLeaders() {
//		return "leaders";
//	}
}
