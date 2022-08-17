// NativeSQLQueryMethodsTestRunner.java
package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;


@Component
public class NativeSQLQueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository  actorRepo;

	@Override
	public void run(String... args) throws Exception {
	
		int count=actorRepo.insertActor("rajesh1", "CLERK1", 99999991L);
		System.out.println(count==0?"Record not inserted":"Record inserted");
		
		System.out.println("Date ::"+actorRepo.showDate());
		
			
		
	}//run(-)
}//class
