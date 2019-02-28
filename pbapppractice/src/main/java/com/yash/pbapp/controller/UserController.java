package com.yash.pbapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.pbapp.serviceimpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl serviceImpl;
	
	@RequestMapping(value={"/user"})
	public String hello() {
		
		serviceImpl.save();
		return "hi";
	}
}
