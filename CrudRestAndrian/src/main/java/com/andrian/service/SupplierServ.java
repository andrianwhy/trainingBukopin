package com.andrian.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrian.repository.SupplierRepo;

@Service
@Transactional
public class SupplierServ {

	@Autowired
	SupplierRepo sr;
	
	
}
