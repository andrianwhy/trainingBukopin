package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontEndMvc {
	
	@RequestMapping("mvc")
	public String halDepan(Model model) {
		String nama = "andrian";
//		int nilai = 100;
		model.addAttribute("hNama", nama);
		return "frontendmvc/haldepan";
	}
	
	@RequestMapping("mvc2")
	public String mvc2(Model md) {
		String nama = "andrian";
		String alamat = "bogor";
		int umur = 22;
//		int nilai = 100;
		md.addAttribute("hNama", nama);
		md.addAttribute("hAlamat", alamat);
		md.addAttribute("hUmur", umur);
		return "frontendmvc/mvc2";
	}
	
	@RequestMapping("mvc3")
	public String mvc3(
			@RequestParam(value = "hNama",required = false, defaultValue = "")String nm,
			@RequestParam(value = "hAlamat",required = false, defaultValue = "")String almt,
			@RequestParam(value = "hUmur",required = false,defaultValue = "0")String umur) {
		System.out.println(nm+" "+almt+" "+umur);	
		return "frontendmvc/mvc3";
	}
	
	@RequestMapping("mvc4")
	public String mvc4(Model md) {
		int[] listthn = {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
		md.addAttribute("Hlistthn",listthn);
		System.out.println("");
		return "frontendmvc/mvc4";
	}
}
	