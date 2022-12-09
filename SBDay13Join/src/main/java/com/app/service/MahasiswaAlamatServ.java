package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Areakerja;
import com.app.repo.AreaKerjaRepo;
import com.app.repo.MahasiswaAlamatRepo;
import com.app.repo.MahasiswaRepo;

@Service
@Transactional
public class MahasiswaAlamatServ {
	
	@Autowired
	private MahasiswaAlamatRepo mr;
	
}
