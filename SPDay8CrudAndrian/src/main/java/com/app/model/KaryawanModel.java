package com.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "mKaryawan")
public class KaryawanModel {

	@jakarta.persistence.Id
	@Column(name = "idKaryawan")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "namaKaryawan")
	private String nama;
	
	@Column(name = "umur")
	private int umur;
 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	
	
}
