package com.andrian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrian.model.Supplier;

public interface SupplierRepo extends JpaRepository<Supplier, Integer> {

}
