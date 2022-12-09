package com.app.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Areakerja;
import com.app.repo.AreaKerjaRepo;
import com.app.repo.MahasiswaRepo;

@Service
@Transactional
public class MahasiswaServ {
	
	@Autowired
	private MahasiswaRepo mr;
	
	public List<Map<String, Object>> listmahasiswa(){
		return mr.listMahasiswa();
	}
	
	public List<Map<String, Object>> listalmtmahasiswa(){
		return mr.listAlmtMahasiswa();
	}
}
