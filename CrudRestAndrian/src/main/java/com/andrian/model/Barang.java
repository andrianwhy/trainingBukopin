package com.andrian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mBarang")
public class Barang {

	@Id
	@Column(name = "idBarang")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "namaBarang")
	private String Nama_barang;
	
	@Column(name = "IdSupplier")
	private int IdSupplier;
	
	@Column(name = "qty")
	private int Qty;

	@ManyToOne
	@JsonIgnoreProperties("barangs")
	@JoinColumn(name = "id")
	private Supplier supplier;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama_barang() {
		return Nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		Nama_barang = nama_barang;
	}

	public int getIdSupplier() {
		return IdSupplier;
	}

	public void setIdSupplier(int idSupplier) {
		IdSupplier = idSupplier;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}
	
	
}
