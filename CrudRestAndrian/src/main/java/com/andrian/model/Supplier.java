package com.andrian.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mSupplier")
public class Supplier {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "NamaSupplier")
	private String Nama_supplier;
	
	@OneToMany(mappedBy = "supplier")
	@JsonIgnoreProperties("supplier")
	private List<Barang> barangs;
}
