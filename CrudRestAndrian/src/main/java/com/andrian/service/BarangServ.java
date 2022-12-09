package com.andrian.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrian.model.Barang;
import com.andrian.repository.BarangRepo;

@Service
@Transactional
public class BarangServ {

	@Autowired
	BarangRepo br;
	
	public List<Map<String, Object>> listAll(){
		return br.listBarang();
	}
	
	public void addBarang(Barang bm) {
		br.addBarang(bm.getNama_barang(), bm.getQty(), bm.getIdSupplier());
	}
	
	public void delBarang(int id) {
		br.delBarang(id);
	}
}
