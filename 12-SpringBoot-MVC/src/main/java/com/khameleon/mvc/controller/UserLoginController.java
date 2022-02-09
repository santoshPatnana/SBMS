package com.khameleon.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khameleon.mvc.dao.UserLoginDao;

@Controller
public class UserLoginController {
	@Autowired
	UserLoginDao userLoginDao;
	
	@GetMapping(value="/login")
	public String getLoginPage() {
		return "userLogin";
	}
	
	@PostMapping(value="/checkLogin")
	public String verifyLogin(@RequestParam String userName, @RequestParam String password, Model model) {		
		boolean flag = userLoginDao.fetchLoginDetails(userName, password);
		if(flag) {
			model.addAttribute("userName",userName);
			return "loginSuccess";
		}
		else {
			model.addAttribute("message","bad credentials");
			return "userLogin";
		}
	}
}
