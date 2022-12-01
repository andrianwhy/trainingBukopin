package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.KaryawanModel;
import com.app.repositorys.KaryawanRepo;

@Service
@Transactional
public class KaryawanService {
	
	@Autowired
	private KaryawanRepo kr;
	
	public List<KaryawanModel> listKaryawan() {
		return kr.findAll();
	}
}
