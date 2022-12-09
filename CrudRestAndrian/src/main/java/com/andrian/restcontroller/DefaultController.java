package com.andrian.restcontroller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andrian.model.Barang;
import com.andrian.model.Users;
import com.andrian.service.BarangServ;
import com.andrian.service.UsersServ;

@RestController
public class DefaultController {
	@Autowired
	UsersServ us;
	
	@Autowired
	BarangServ bs;
	
	@PostMapping(value = "login")
	public ResponseEntity<Object> ceklogin(@RequestBody Users um) {
		//TODO: process POST request
		List<Map<String, Object>>listuser = us.ceklogin(um);
		
		if (listuser.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("result : user/pass salah!");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body("Success Login");
		}			
	}

	@GetMapping(value = "listbarang")
	public List<Map<String, Object>> getBarang() {
		return bs.listAll();
	}

	@PostMapping(value = "addbarang")
	public Barang addBarang(@RequestBody Barang bm) {
		//TODO: process POST request
		bs.addBarang(bm);		
				
		return bm;
	}

	
	@PostMapping(value = "delbarang")
	public Integer delbarang(@RequestBody int id) {
		//TODO: process POST request
		bs.delBarang(id);
		
		return 0;
	}

}
