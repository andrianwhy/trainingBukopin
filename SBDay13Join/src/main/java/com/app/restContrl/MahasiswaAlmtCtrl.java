package com.app.restContrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.MahasiswaAlamatServ;


@RestController
@RequestMapping("api/mahasiswa")
public class MahasiswaAlmtCtrl {
	
	@Autowired
	public MahasiswaAlamatServ ms;
	

}
