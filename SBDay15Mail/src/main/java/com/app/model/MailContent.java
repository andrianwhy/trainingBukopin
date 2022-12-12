package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MailContent {

	@Id
	private String isi;

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}
}
