package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.KaryawanModel;
import com.app.services.KaryawanService;

@Controller
public class KaryawanController {

	@Autowired
	private KaryawanService ks;
	
	@RequestMapping("listkaryawan")
	public String listKaryawan(Model md) {
		List<KaryawanModel>listKaryawan = ks.listKaryawan();
		md.addAttribute("hListKaryawan", listKaryawan);
		return "Karyawan/List";
	}
	
//	@RequestMapping("listkaryawan")
//	@ResponseBody
//	public List<KaryawanModel>listKaryawan(Model md) {
////		List<KaryawanModel>listKaryawan = ks.listKaryawan();
////		md.addAttribute("hListKaryawan", listKaryawan);
//		return ks.listKaryawan();
//	}
}
