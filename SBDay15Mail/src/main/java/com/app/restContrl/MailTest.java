package com.app.restContrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.configs.MailConfig;
import com.app.model.MailContent;
import com.app.model.MailModel;
import com.app.servs.MailContServ;

@RestController
@RequestMapping(value = "api/mail/")
public class MailTest {
	
	@Autowired
	private MailConfig mc;
	
	@Autowired
	private MailContServ ms;
	
	@PostMapping(value = "send") 
	public void kirim(@RequestBody List<MailModel> mm) {
//		mc.kirim(mm.getTo(),mm.getSubject(),mm.getText()); 
		List<MailContent> isi = ms.isi();
//		System.out.println(isi.get(0).getIsi());
		
		String isiMail = isi.get(0).getIsi();
		
		for (MailModel lmm : mm) {
			mc.kirim(lmm.getTo(),lmm.getSubject(),isiMail);
		}
	} 
}
