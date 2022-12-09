package com.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nama;
	
	//private int idIdcard;
	
	//untuk panggil object
	@OneToOne
	@JoinColumn(name="id_idcard")
	private Idcard idcard;

//	public int getIdIdcard() {
//		return idIdcard;
//	}
//
//	public void setIdIdcard(int idIdcard) {
//		this.idIdcard = idIdcard;
//	}
	

	public int getId() {
		return id;
	}

	public Idcard getIdcard() {
		return idcard;
	}

	
	public void setIdcard(Idcard idcard) {
		this.idcard = idcard;
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
	


}
