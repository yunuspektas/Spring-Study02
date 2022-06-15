package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tpe.thirdparty.ThirtPartyComponent;

@Configuration
@ComponentScan("com.tpe")  // ComponentScan proje ( "()" burada yazılan com.tpe de arıyacak )  içindeki dosyaları tarar ve 
						// annote edilmiş işaretlenmiş sınıfları tespit ederek spring-containera bean olarak ekler
@PropertySource("classpath:application.properties")
public class AppConfiguration {
	
	// Third party bileşenlerin spring container tarafından oluşturulup Containera konması için @Bean anno. kullandık
	@Bean
	public ThirtPartyComponent thirdPartyComponent() {
		
		return new ThirtPartyComponent();
		
	}
	
	

}
