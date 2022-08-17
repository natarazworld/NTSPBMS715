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
		Actor  actor=actorRepo.getActorByMobileNo(9999L);
		if(actor!=null)
			System.out.println("Actor Info:"+actor);
		else
			System.out.println("Actor not found");
		System.out.println("----------------------------------");
		Object  data=actorRepo.getActorDataByMobileNo(9999L);
		Object result[]=(Object[])data;
		for(Object val: result) {
			System.out.print(val+"  ");
		}
		System.out.println("----------------------------------");
		 String  name=actorRepo.getActorNameByMobileNo(9999L);
		 System.out.println("actor name ::"+name);
		
		 System.out.println("----------------------------------");
			Actor  actor1=actorRepo.findById(101).get();
			System.out.println(actor1);
			System.out.println("----------------------------------");
			System.out.println("Actors count::"+actorRepo.getActorsCount("hero"));
			System.out.println("___________________________");
			Object aresults[]=(Object[])actorRepo.getActorsAggragateData();
			System.out.println(" count of records :"+aresults[0]);
			System.out.println(" max  of  aid "+aresults[1]);
			System.out.println(" min of aid"+aresults[2]);
			System.out.println(" sum of aid"+aresults[3]);
			System.out.println(" avg of aid"+aresults[4]);
			
			System.out.println("___________________________");
			Actor actorInfo=actorRepo.getActorDataByMaxActorId();
			System.out.println(actorInfo);
			
		
	}//run(-)
}//class
