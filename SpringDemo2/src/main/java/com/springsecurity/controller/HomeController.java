package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHome() {
		return "home"; 
	}
	@GetMapping("/menu")
	public String showMenu() {
		return "menu"; 
	}
	
	@RequestMapping("/showLoginPage")
	public String showLogin() {
		return "custom-loginform";
	}
	@GetMapping("/main")
	public String helloMain() {
		return "main";
	}
	
	//add request mapping for the leaders
	@GetMapping("/leaders")
	public String showLeaders() {
		return "leaders";
	}
	
	@GetMapping("/systems")
	public String showSystems() {
		return "systems";
	}
	
	//add request mapping for access-denied page
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		return "access-denied";
		
	}
	
}
