// QueryMethodsTestRunner.java
package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.repository.IActorRepository;


@Component
public class QueryMethodsTestRunner implements CommandLineRunner{
	@Autowired
	private IActorRepository  actorRepo;

	@Override
	public void run(String... args) throws Exception {
		
       actorRepo.searchActorsByCategory("hero").forEach(System.out::println);		
		   		
		
	}

}
