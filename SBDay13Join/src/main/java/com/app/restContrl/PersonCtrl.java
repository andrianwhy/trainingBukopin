package com.app.restContrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Person;
import com.app.service.PersonServ;

@RestController
@RequestMapping("api/person")
public class PersonCtrl {
	
	@Autowired
	public PersonServ ps;
	
	@GetMapping(value="listall")
	public List<Person> listAll(){
		return ps.listAll();
	}
}
