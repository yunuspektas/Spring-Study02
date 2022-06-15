package com.tpe.repository;

import org.springframework.stereotype.Component;

@Component    // bean olacak sınıfı işaret eder
public class MessageRepository {
	
	public void  saveMessage(String message ) {
		System.out.println("I am saving th message");
		
	}

}
