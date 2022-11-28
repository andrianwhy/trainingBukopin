package com.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
	
	@RequestMapping("halaman1")
	@ResponseBody
	public String halaman1() {
		return "ini halaman 1";
		
	}
}
