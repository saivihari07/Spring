package com.springecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springecommerce.dao.UserInfoDao;
import com.springecommerce.model.UserInfo;

@Controller
public class MainController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	@RequestMapping("/main")
	public String showMain() {
		return "main";
	}
	@RequestMapping("/signup")
	public String registerPage(@ModelAttribute("userInfo") UserInfo userInfo) {
		
		return "register";
	}
	@RequestMapping("/login")
	public String showLogin() {
		return "custom-loginform";
	}
	@RequestMapping("/access-denied")
	public String accessDenied() {
		return "access-denied";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("userInfo") UserInfo userInfo, BindingResult result,Model model) {
		//UserInfo userInfo = new UserInfo();
		model.addAttribute("userInfo",userInfo);
		if(result.hasErrors()) {
			return "register";
		}
//		System.out.println("name"+userInfo.getUsername());
//		System.out.println("Email"+userInfo.getEmail());
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		userInfo.setEnabled(true);
		userInfo.setRole("ROLE_USER");
		userInfoDao.saveUser(userInfo);
		return "register-success";
		
	}
	@RequestMapping("/admins")
	public String showAdmin() {
		return "main";
	}
	
}
