package com.app.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.PegawaiModel;

public interface PegawaiRepo extends JpaRepository<PegawaiModel, Integer> {

	//jpa
	//custome
	public List<PegawaiModel>findAllByOrderById();
	
	//native
	@Query(value = "Select * from m_pegawai order by id_pegawai",nativeQuery = true)
	public List<PegawaiModel>ListPegawaiJPQL();
	
	@Query(value = "Select count(*) from m_pegawai",nativeQuery = true)
	public Integer TotalPegawaiJPQL();
	
	@Modifying
	@Query(value = "insert into m_pegawai(nama,alamat,umur) values(:nama, :alamat, :umur)",nativeQuery = true)
	public void addPegawai(String nama,String alamat, int umur);
	
	@Modifying
	@Query(value = "update m_pegawai set nama=:nama, alamat=:alamat, umur=:umur where id_pegawai=:id",nativeQuery = true)
	public void edtPegawai(String nama, int id, String alamat, int umur);
	
	@Modifying
	@Query(value = "delete from m_pegawai where id_pegawai=?1",nativeQuery = true)
	public void delPegawai(int id);
	
	
}
