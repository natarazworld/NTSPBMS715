//Vehicle.java (target class)
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	//@Qualifier("pEngine")   // performs  byName mode of Auotwiring
	//@Qualifier("${engine.type}")  //invalid
	 //@Qualifier("@Value${engine.type}")  //invalid
	//@Value("@Value${engine.type}")  invalid
	@Qualifier("engg")
	private  IEngine engine;  //HAS-A property
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}
	
	//b.method
	public  void  jounery(String startPlace , String destPlace) {
		  engine.start();
		  System.out.println("Jounery is started at::"+startPlace);
		  System.out.println("Jounery is going.... on ....");
		  engine.stop();
		  System.out.println("Jounery is stopped at::"+destPlace);
	}

}
