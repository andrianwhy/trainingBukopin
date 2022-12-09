package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Areakerja;
import com.app.repo.AreaKerjaRepo;

@Service
@Transactional
public class AreakerjaServ {
	
	@Autowired
	private AreaKerjaRepo ar;
	
	public List<Areakerja>listAll(){
		return ar.findAll();
	}
}
