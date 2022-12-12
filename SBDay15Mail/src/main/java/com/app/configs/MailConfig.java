package com.app.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailConfig {

	@Autowired
	JavaMailSender javaMailSender;
	
	 
	public void kirim(String to, String subject, String body) {
		SimpleMailMessage pesan = new SimpleMailMessage();
		
		pesan.setTo(to);
		pesan.setSubject(subject);
		pesan.setText(body);
		
		javaMailSender.send(pesan);
	}
}
