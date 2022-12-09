package com.andrian.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.andrian.model.Barang;

public interface BarangRepo extends JpaRepository<Barang, Integer> {
	
	@Query(value = "select id_barang, nama_barang, nama_supplier, qty from m_barang mb "
			+ "join m_supplier ms on mb.id_supplier = ms.id", nativeQuery = true)
	List<Map<String, Object>> listBarang();
	
//	INSERT INTO public.m_barang( id_supplier, nama_barang, qty)VALUES 
//	(1, 'LCD 22" Toshiba', 100),
//	(1, 'DDR 5 1Gb', 50);
	
	@Modifying
	@Query(value = "INSERT INTO m_barang(nama_barang, qty, id_supplier) VALUES (:nama_barang, :qty, :supplier)",nativeQuery = true)
	public void addBarang(String nama_barang, int qty, int supplier);
	
	@Query(value = "DELETE FROM m_barang WHERE id_barang = :id",nativeQuery = true)
	public void delBarang(int id);
}
