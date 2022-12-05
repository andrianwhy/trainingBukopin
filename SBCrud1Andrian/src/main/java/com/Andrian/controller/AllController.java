package com.Andrian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Andrian.model.BarangModel;
import com.Andrian.model.UsersModel;
import com.Andrian.services.BarangService;
import com.Andrian.services.UsersService;

@Controller
public class AllController {
	
	@Autowired
	private UsersService us;
	
	@Autowired
	private BarangService bs;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	@ResponseBody
	public String cekLogin(UsersModel um) {
//		if (us.cekUser(um) == 0) {
//			return "/";
//		} else {	
//			
//			return "redirect:/listbarang";
//		}	
//		Integer ada = us.cekUser(um);
		us.cekUser(um);
		
		return "ada";
	}
	
	@RequestMapping("listbarang")
	public String listBarang(Model md) {
		List<BarangModel>ListBarang = bs.ListBarang();		
		int CountBarang = bs.totalBarang();
		
		md.addAttribute("hListBarang",ListBarang);
		md.addAttribute("hCountBag",CountBarang);
		
		return "Barang/listBarang";
	}
	 
	@RequestMapping("addbarang")
	public String addBarang() {
		return "Barang/addBarang";
	}
	
	@RequestMapping(value = "saveBarang",method = RequestMethod.POST)
	public String saveBarang(BarangModel bm) {
		bs.addBarang(bm);
		return "redirect:/listbarang";
	}
	
	@RequestMapping("editbarang")
	public String editBarang(BarangModel bm, Model md) {				
				
		if (bs.cariBarang(bm).isEmpty()) {
			return "redirect:/listbarang";
		} else {
			List<BarangModel>ListBarang = bs.cariBarang(bm);
			md.addAttribute("hListBarang",ListBarang);
			
			return "Barang/editBarang";
		}		
	}
	
	@RequestMapping(value = "updatebarang",method = RequestMethod.POST) 
	public String updateBarang(BarangModel bm) {		
		bs.editBarang(bm); 
		return "redirect:/listbarang";
	}
	
	@RequestMapping(value = "deletebarang",method = RequestMethod.POST)
	public String deleteBarang(BarangModel bm) {		
		bs.delBarang(bm);
		return "redirect:/listbarang";
	}
}
