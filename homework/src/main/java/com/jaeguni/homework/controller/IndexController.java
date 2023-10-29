package com.jaeguni.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	//메인
	@GetMapping("/")
	public String mainView() {
		return "index";
	}
	
}
