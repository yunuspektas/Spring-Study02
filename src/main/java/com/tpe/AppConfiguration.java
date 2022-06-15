package com.tpe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tpe")  // ComponentScan proje ( "()" burada yazılan com.tpe de arıyacak )  içindeki dosyaları tarar ve 
						// annote edilmiş işaretlenmiş sınıfları tespit ederek spring-containera bean olarak ekler
public class AppConfiguration {
	
	

}
