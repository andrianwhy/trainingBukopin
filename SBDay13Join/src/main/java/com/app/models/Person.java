package com.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Person {
	
	@Id
	private int id;
	
	private String nama;
		
	//join OneToOne-unidirectional
//	@OneToOne
//	@JsonIgnoreProperties("person")
//	@JoinColumn(name = "id_areakerja")
//	private Areakerja areakerja;
	
//	private int idAreakerja;
	
	@ManyToOne
	@JsonIgnoreProperties("persons")
	@JoinColumn(name = "id_areakerja")
	private Areakerja areakerja;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Areakerja getAreakerja() {
		return areakerja;
	}

	public void setAreakerja(Areakerja areakerja) {
		this.areakerja = areakerja;
	}

	
}
