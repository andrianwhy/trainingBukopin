package com.Andrian.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Andrian.model.UsersModel;

public interface UsersRepo extends JpaRepository<UsersModel, Integer> {

	@Query(value = "select count(*) from users where id =:id and users=:users", nativeQuery = true)
	public int cekUser(int id, String users);
}
