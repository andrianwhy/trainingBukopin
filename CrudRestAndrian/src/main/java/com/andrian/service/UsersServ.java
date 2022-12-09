package com.andrian.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrian.model.Users;
import com.andrian.repository.UsersRepo;

@Service
@Transactional
public class UsersServ {

	@Autowired
	UsersRepo ur;	
	
	public List<Map<String, Object>> ceklogin(Users um) {
		return ur.ceklogin(um.getUsers(), um.getPassword());
	}
}
