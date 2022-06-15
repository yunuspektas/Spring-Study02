package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tpe.repository.MessageRepository;

@Component("whatsAppService")
public class WhatsAppService implements MessageService {
	
	@Autowired  // Dependency injection ---> aşağıda sadece değişken oluşturuldu, obje oluşturulmadı, @Autowired olmadan uygulama run 
				// edilirse NUllPointerException hatası alırız, @Autowire annotationı ile containerda daha önce bean olarak oluşturulan 
				// obje bu referansa bağlanır
	private MessageRepository repository ;

	@Override
	public String sendMessage() {
		
		 repository.saveMessage("I am a Wahtsapp Service, I sent a wa message");
		 return "I am a Whatsapp Service, I sent a wa message";
	}

}
