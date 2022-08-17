// JQueryMethodsTestRunner.java
package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;


@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository  actorRepo;

	@Override
	public void run(String... args) throws Exception {
		int count=actorRepo.updateActorMobileNoByAid(9999999L, 101);
		System.out.println(count==1?"Actor mobile no is updated":"Actor mobile no is not found");
		
		
		System.out.println("no.of records deleted ::"+actorRepo.deleteActorsByCategory("hero"));
			
		
	}//run(-)
}//class
