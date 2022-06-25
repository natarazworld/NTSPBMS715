//PetrolEngine.java (Dependent class2)
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}
	
	@Override
	public void start() {
       System.out.println("PetrolEngine :: started");
	}

	@Override
	public void stop() {
	       System.out.println("PetrolEngine :: stopped");
	}

}
