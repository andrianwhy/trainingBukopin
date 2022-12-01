package com.app.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.KaryawanModel;

public interface KaryawanRepo extends JpaRepository<KaryawanModel, Integer> {
	//jpa
}
