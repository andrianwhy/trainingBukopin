package com.app.servs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.MailContent;
import com.app.repo.MailContRepo;

@Service
@Transactional
public class MailContServ {

	@Autowired
	MailContRepo mr;
	
	public List<MailContent> isi() {
		return mr.findAll();
	}
}
