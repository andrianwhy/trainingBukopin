package com.Andrian.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Andrian.model.BarangModel;

public interface BarangRepo extends JpaRepository<BarangModel, Integer> {
	
	@Query(value = "Select * from barang where is_delete = false order by id",nativeQuery = true)
	public List<BarangModel>Listbarang(); 
	
	@Query(value = "Select * from barang where id=:id and is_delete = false",nativeQuery = true)
	public List<BarangModel>cariBarang(int id); 
	
	@Query(value = "Select sum(qty) from barang where is_delete = false ",nativeQuery = true)
	public Integer totalBarang(); 
	
	@Modifying
	@Query(value = "INSERT INTO barang(nama_barang, qty, supplier, created_on, is_delete) VALUES (:nama_barang, :qty, :supplier, :created_on, false)",nativeQuery = true)
	public void addBarang(String nama_barang, int qty, String supplier, String created_on);

	@Modifying
	@Query(value = "update barang set nama_barang=:nama, qty=:qty, supplier=:supplier, modified_on=:modified_on	WHERE id=:id",nativeQuery = true)
	public void editBarang(int id, String nama, int qty, String supplier, String modified_on);

	@Modifying
	@Query(value = "update barang set is_delete = true, delete_on = :delete_on where id =:id",nativeQuery = true)
	public void delBarang(int id, String delete_on); 
	
}
