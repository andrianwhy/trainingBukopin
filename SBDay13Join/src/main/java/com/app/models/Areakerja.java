package com.app.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Areakerja {
	
	@Id	
	private int id;
	
	private String lantai;
	
	//bidirectional
//	@OneToOne(mappedBy = "areakerja")
//	@JsonIgnoreProperties("areakerja")
//	private Person person;
	
	@OneToMany(mappedBy = "areakerja")
	@JsonIgnoreProperties("areakerja")
	private List<Person> persons;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLantai() {
		return lantai;
	}

	public void setLantai(String lantai) {
		this.lantai = lantai;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}


}
