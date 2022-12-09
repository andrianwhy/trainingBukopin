package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Person;
import com.app.repo.PersonRepo;

@Service
@Transactional
public class PersonServices {
	@Autowired
	private PersonRepo pr;
	
	public List<Person>listPerson(){
		return pr.findAll();
	}

}
