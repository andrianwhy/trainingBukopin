package com.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PegawaiController {
	
	@RequestMapping("halPegawai")
	@ResponseBody
	public String halPegawai() {
		System.out.println("Halaman Pegawai di akses");
		return "Halaman Pegawai";
	}
}
