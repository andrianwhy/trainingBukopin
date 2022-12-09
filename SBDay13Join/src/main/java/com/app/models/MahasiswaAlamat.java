package com.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MahasiswaAlamat {
		
	@Id
	private int id;
	
	private String alamat;
	
	private int nim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}
	
}
