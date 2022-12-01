package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.PegawaiModel;
import com.app.services.PegawaiService;

@Controller
public class PegawaiController {
	@Autowired
	private PegawaiService ps;
	
	@RequestMapping("listpegawai")	
	public String ListPegawai(Model md){
		List<PegawaiModel>listPegawai = ps.listPegawai();
		int Total = ps.totPegawai();
		md.addAttribute("hListPegawai", listPegawai);
		md.addAttribute("hTotPegawai", Total);
		return "Pegawai/List";
	}
	
	@RequestMapping("addpegawai")
	public String vAddPegawai() {
		return "Pegawai/AddPegawai";
	}
	
	@RequestMapping(value = "save",method = RequestMethod.POST)
	public String addPegawai(PegawaiModel pm) {
		ps.addPegawai(pm);
		return "redirect:/listpegawai";
	}
	
	@RequestMapping(value = "saveupd", method = RequestMethod.POST)
	public String editPegawai(PegawaiModel pm) {
		ps.edtPegawai(pm);
		return "redirect:/listpegawai";
	}
	
	@RequestMapping(value = "delpegawai", method = RequestMethod.POST)
	public String delPegawai(PegawaiModel pm) {
		ps.delPegawai(pm); 
		return "redirect:/listpegawai";
	}

}
