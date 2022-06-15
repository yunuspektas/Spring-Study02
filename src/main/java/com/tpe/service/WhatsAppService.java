package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.tpe.repository.Repository;

@Component("whatsAppService")
public class WhatsAppService implements MessageService {
	
	// @Autowired --> // Dependency injection ---> aşağıda sadece değişken oluşturuldu, obje oluşturulmadı, @Autowired olmadan uygulama run 
				// edilirse NUllPointerException hatası alırız, @Autowire annotationı ile containerda daha önce bean olarak oluşturulan 
				// obje bu referansa bağlanır
	//@Qualifier("dbRepository")---> // aşağıdaki Repository interfaceinden implemen edilen 2 sınıf olduğu için ve hangi sinifin
								// çağırılacagı belli olsun diye bu annotation kullanılıyor
	 
    //Dependency injection 
    //Otomatik olarak bu nesneyi bu sınıfa bağla
    
    
    /*Field injection
     * @Autowired
     * @Qualifier("dbRepository")
     * private Repository repository;
     */
    
    
    /*Contructor injection
    private Repository repository;
    @Autowired
    public WhatsAppService(@Qualifier("dbRepository") Repository repository ) {
        this.repository=repository;
    }
    */
    
    //Setter Injection
    @Autowired
    @Qualifier("dbRepository")
    private Repository repository;
    public void setRepository( Repository repository) {
        this.repository=repository;
    }
    @Override
    public String sendMessage() {
        repository.saveMessage("I am a Whatsapp Service, I sent a wa message");
        return "I am a Whatsapp Service, I sent a wa message";
    }

}
