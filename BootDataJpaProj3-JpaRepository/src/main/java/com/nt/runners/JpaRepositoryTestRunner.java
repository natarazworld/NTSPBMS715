// JpaRepositoryTestRunner.java
package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IActorService service;

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("_______________deleteAllActorsById(-)____________");
		//System.out.println(service.removeActorsByIdsInBatch(List.of(34,35,23,100,200)));
		/* List<Integer> ids=new ArrayList();
		  ids.add(34); ids.add(null);
		  System.out.println(service.removeActorsByIdsInBatch(ids));*/
		/*		System.out.println("_______________getRerefenceById(-)____________");
				try {
				//System.out.println("456  Actor Information::"+service.searchActorById(4561));
					Actor  actor=service.searchActorById(456);
					System.out.println(actor.getAname()+ "  "+actor.getCategory());
				}
				catch(Exception e) {
					System.out.println("record not found");
					e.printStackTrace();
				}
		*/
		  System.out.println("________________ find(Example example,Sort sort)______________");
		    try {
		    	Actor actor=new Actor(null,null,"hero",9999L);
		    	List<Actor> list=service.searchActorsByActor(actor, true, "aname");
		    	list.forEach(System.out::println);
		    	
		    }
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
		
	}//run(-)
}//class
