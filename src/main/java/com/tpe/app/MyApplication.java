package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.service.MessageService;

public class MyApplication {
	
	public static void main(String[] args) {
		
		// konfigurasyon sınıfı okunuyor
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfiguration.class);
		
		MessageService servise = context.getBean("whatsAppService", MessageService.class); // MessageServie interfaceinden concreate
																		// olan mailServişce sınıfından bean oluşmasını istiyorum.
		System.out.println(servise.sendMessage());
		
		context.close();
		
	}
	
	

}
