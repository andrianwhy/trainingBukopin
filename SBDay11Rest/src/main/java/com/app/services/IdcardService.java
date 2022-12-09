package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Idcard;
import com.app.repo.IdcardRepo;

@Service
@Transactional
public class IdcardService {
	
	@Autowired
	private IdcardRepo ir;
	
	public List<Idcard>listIdcards(){
		return ir.findAll();
	}

}
