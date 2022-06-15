package com.tpe.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements MessageService {
	
	@Value("${count}") // properties dosyasındaki app.email adlı değişkene ulaşıp , alttaki değişkene set edildi.
	private String email ;
	
	@Value("${app.email}") 
	private String count ;

	@Override
	public String sendMessage() {
		
		return "I am a mail service, I sent a message : " +  email + " : " + count;
	}
	
	public String getEmail() {
		
		return this.email;
		
	}

}
