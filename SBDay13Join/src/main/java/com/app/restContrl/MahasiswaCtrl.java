package com.app.restContrl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.MahasiswaServ;


@RestController
@RequestMapping("api/mahasiswa")
public class MahasiswaCtrl {
	
	@Autowired
	public MahasiswaServ ms;
	
	@RequestMapping("list")
	public List<Map<String, Object>>listmahasiswa(){
		return ms.listmahasiswa();
	}

	@RequestMapping("listalamat")
	public List<Map<String, Object>>listalmtmahasiswa(){
		return ms.listalmtmahasiswa();
	}
}
