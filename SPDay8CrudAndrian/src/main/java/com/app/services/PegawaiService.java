package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.PegawaiModel;
import com.app.repositorys.PegawaiRepo;

@Service
@Transactional
public class PegawaiService {
	 
	@Autowired
	private PegawaiRepo pr;
	
	//select semua data pegawai
	public List<PegawaiModel> listPegawai(){
		//return pr.findAll(); by jpa
//		return pr.findAllByOrderById(); //by jpa
		return pr.ListPegawaiJPQL(); //by jpql
	}
	
	public int totPegawai() {
		return pr.TotalPegawaiJPQL();
	}
	
	public void addPegawai(PegawaiModel pm) {
//		pr.save(pm); //by jpa
		String nama = pm.getNama();
		pr.addPegawai(nama,pm.getAlamat(),pm.getUmur());
	}
	
	public void edtPegawai(PegawaiModel pm) {
//		pr.save(pm);// by jpa
		pr.edtPegawai(pm.getNama(), pm.getId(), pm.getAlamat(), pm.getUmur()); //by jpql
	}
	 	
	public void delPegawai(PegawaiModel pm) {
//		pr.delete(pm);		//by jpa
		pr.delPegawai(pm.getId());
	}
}
