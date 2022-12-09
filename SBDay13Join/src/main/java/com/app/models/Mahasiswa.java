package com.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
	
	@Id
	private int nim;
	
	private String nama;

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
