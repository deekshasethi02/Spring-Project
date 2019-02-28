package com.example.pbapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	
	@RequestMapping(value= {"/","/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(value= {"/about"})
	public String about() {
		return "about";
	}
	
	@RequestMapping(value= {"/contact"})
	public String contact() {
		return "contact";
	}
	


}
