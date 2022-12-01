package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontEndController {

	@RequestMapping("page1")
	public String halaman1() {
		return "frontend/pg1";
	}
	
}
