package com.app.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.models.Mahasiswa;

public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Integer>{

	@Query(value = "select * from mahasiswa", nativeQuery = true)
	List<Map<String, Object>> listMahasiswa();
	
	@Query(value = "select nama, alamat from mahasiswa join mahasiswa_alamat\r\n"
			+ "on mahasiswa.nim = mahasiswa_alamat.nim", nativeQuery = true)
	List<Map<String, Object>> listAlmtMahasiswa();
	
}
