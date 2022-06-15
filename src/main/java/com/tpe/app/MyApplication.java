package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.service.MessageService;
import com.tpe.thirdparty.ThirtPartyComponent;

public class MyApplication {
	
	public static void main(String[] args) {
		
		// konfigurasyon sınıfı okunuyor
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfiguration.class);
		
		MessageService servise = context.getBean("whatsAppService", MessageService.class); // MessageServie interfaceinden concreate
																		// olan mailServişce sınıfından bean oluşmasını istiyorum.
		System.out.println(servise.sendMessage());
		
		MessageService service2 = context.getBean("mailService", MessageService.class);
		System.out.println(service2.sendMessage());
		
		
		ThirtPartyComponent thirdPartyComponent = context.getBean("thirdPartyComponent", ThirtPartyComponent.class);
		System.out.println(thirdPartyComponent.getMessage());
		
		
		
		
		context.close();
		
	}
	
	

}
