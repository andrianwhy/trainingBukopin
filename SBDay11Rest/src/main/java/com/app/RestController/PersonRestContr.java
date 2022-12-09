package com.app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Person;
import com.app.services.PersonServices;

@RestController
@RequestMapping(value="api/v1/")
public class PersonRestContr {
	
	@Autowired
	private PersonServices ps;
	
	@GetMapping(value="listperson")
	public List<Person>lisPerson(){
		return ps.listPerson();
	}
	

}
