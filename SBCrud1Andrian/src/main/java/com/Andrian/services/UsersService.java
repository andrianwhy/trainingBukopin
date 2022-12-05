package com.Andrian.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Andrian.model.UsersModel;
import com.Andrian.repositorys.UsersRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsersService {
	
	private UsersRepo ur;
	
	public int cekUser(UsersModel um){
		Integer ide =  um.getId();
		System.out.println(ide.toString());
		System.out.println(um.getPassword());
		return ur.cekUser(um.getId(), um.getPassword());
	}
}
