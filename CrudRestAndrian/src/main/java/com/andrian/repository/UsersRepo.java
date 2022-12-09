package com.andrian.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andrian.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{
	 
	 @Query(value = "select * from m_users mu where users = :users and password = :pass", nativeQuery = true)
	 List<Map<String, Object>> ceklogin(String users, String pass);
	 	 
}
