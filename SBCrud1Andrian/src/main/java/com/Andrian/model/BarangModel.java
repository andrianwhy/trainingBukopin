package com.Andrian.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "barang")
public class BarangModel {
	
	@jakarta.persistence.Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@Column(name = "namaBarang")
	private String NamaBarang;
	
	@Column(name = "supplier")
	private String Supplier;
	
	@Column(name = "qty")
	private Integer Qty;
	
	@Column(name = "created_on")
	private String created_on; 
	
	@Column(name = "modified_on")
	private String modified_on; 
	
	@Column(name = "delete_on")
	private String delete_on; 
	
	@Column(name = "is_delete")
	private Boolean is_delete;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNamaBarang() {
		return NamaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		NamaBarang = namaBarang;
	}

	public String getSupplier() {
		return Supplier;
	}

	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getModified_on() {
		return modified_on;
	}

	public void setModified_on(String modified_on) {
		this.modified_on = modified_on;
	}

	public String getDelete_on() {
		return delete_on;
	}

	public void setDelete_on(String delete_on) {
		this.delete_on = delete_on;
	}

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}
	
	
}
