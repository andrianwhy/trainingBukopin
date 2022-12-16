package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/def/")
public class DefaultCtrl {

	@GetMapping("list")
	public String list() {
		return ("ini list,diakses siapa saja");
	}
	
	@GetMapping("add")
	public String add() {
		return ("contoh add, akses hanya admin dan spv");
	}
	
	@GetMapping("delete")
	public String delete() {
		return ("contoh delete, akses hanya spv");
	}
}
