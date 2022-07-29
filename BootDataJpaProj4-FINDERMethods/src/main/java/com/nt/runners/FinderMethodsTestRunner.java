// FinderMethodsTestRunner.java
package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IActorRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner{
	@Autowired
	private IActorRepository  actorRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SURESH name actors info::");
		actorRepo.findByAnameEquals("SURESH").forEach(System.out::println);
		
		System.out.println("-----------------------");
		System.out.println("NARESH name actors info::");
		actorRepo.findByAnameIs("NARESH").forEach(System.out::println);
		
		System.out.println("-----------------------");
		System.out.println("SURESH name actors info::");
		actorRepo.findByAname("NARESH").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAidBetween(20,50).forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByCategoryEqualsIgnoreCase("hero").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAnameLike("S%").forEach(System.out::println);
		actorRepo.findByAnameLike("%H").forEach(System.out::println);
		actorRepo.findByAnameLike("N%H").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAnameStartingWith("S").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAnameContainingIgnoreCase("S").forEach(System.out::println);
		
		
	}

}
