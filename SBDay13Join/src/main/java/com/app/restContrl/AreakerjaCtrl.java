package com.app.restContrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Areakerja;
import com.app.service.AreakerjaServ;

@RestController
@RequestMapping("api/areakerja")
public class AreakerjaCtrl {
	
	@Autowired
	public AreakerjaServ as;
	
	@GetMapping(value="listall")
	public List<Areakerja> listAll(){
		return as.listAll();
	}
}
