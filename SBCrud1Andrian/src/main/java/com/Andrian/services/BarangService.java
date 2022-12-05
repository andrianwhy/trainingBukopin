package com.Andrian.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Andrian.model.BarangModel;
import com.Andrian.repositorys.BarangRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BarangService {

	@Autowired
	private BarangRepo br;
	
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	
	public List<BarangModel>ListBarang(){
		return br.Listbarang();
	}
	
	public Integer totalBarang() {
		return br.totalBarang();
	}
	
	public List<BarangModel>cariBarang(BarangModel bm){
		return br.cariBarang(bm.getId());		
	}
	
	public void addBarang(BarangModel bm) {		
		br.addBarang(bm.getNamaBarang(), bm.getQty(), bm.getSupplier(), formatter.format(date));
	}
	
	public void editBarang(BarangModel bm) {
		br.editBarang(bm.getId(), bm.getNamaBarang(), bm.getQty(), bm.getSupplier(), formatter.format(date));
	}
	
	public void delBarang(BarangModel bm) {
		br.delBarang(bm.getId(), formatter.format(date));
	}
}
