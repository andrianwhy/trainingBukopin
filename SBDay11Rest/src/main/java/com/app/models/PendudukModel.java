package com.app.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PendudukModel {
	
	@NotBlank(message = "nama tidak boleh kosong")
	@Size(min = 10, message = "minimal 10 karakter")
	private String nama;
	
	@Size(min = 30, max = 200, message = "minimal 30 karakter, maksimal 200 karakter")
	private String alamat;
	
	@Min(value = 18, message = "minimal 18 tahun")
	@Max(value = 55, message = "maksimal 55 tahun")
	private String umur;
	
	@Email(message = "format harus email")
	private String email;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getUmur() {
		return umur;
	}
	public void setUmur(String umur) {
		this.umur = umur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
