package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	
	int i = 0;
	
	@RequestMapping("/usr/home/main/test1")
	@ResponseBody
	public int showMain1() {
		return i++;
	}
	
	@RequestMapping("/usr/home/main/test2")
	@ResponseBody
	public double showMain2() {
		return (double) i++;
	}
}