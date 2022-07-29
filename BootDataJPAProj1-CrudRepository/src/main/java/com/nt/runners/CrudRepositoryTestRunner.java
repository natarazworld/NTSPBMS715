//CrudRepositoryTestRunner.java
package com.nt.runners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		// for  count  method 
	/*	try {
			System.out.println("records count is ::"+service.fetchRecordsCount());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");
		try {
		Iterable<Actor>  it=service.fetchAllActors();
		it.forEach(actor->{                   // java 8 forEach(-) method
			System.out.println(actor);
		});
		System.out.println("__________________");
		it.forEach(System.out::println);  //java8  forEach(-) method with static method reference
		System.out.println("___________________");
		for(Actor actor:it) {    // java enhanced for loor loop
			System.out.println(actor);
		}
		
		System.out.println("___________________");
		it.forEach(actor->System.out.println(actor)	);  // java8 forEach(-) method with single line code
		
		System.out.println("___________________");
		 List<Actor>  list=(List<Actor>)it;
		 list.stream().forEach(System.out::println);  // java 8 streaming api   + forEach(-) method
		 
		 System.out.println("___________________");
		 System.out.println("count of records ::"+list.stream().count());  // java 8 streaming api for  Aggragate operations
		 System.out.println("___________________");
		 System.out.println("Sorted records");
		 list.stream().sorted(Comparator.comparing(actor->actor.getAid())).forEach(System.out::println);    // java 8 streaming api  for sorting  
		 System.out.println("_______________________");
		 list.stream().sorted((a1,a2)->a1.getAname().compareTo(a2.getAname())).forEach(System.out::println);  // java 8 steaming api  for sorting  
		 System.out.println("________________________");
		 List<String> namesList=list.stream().map(actor-> actor.getAname()).collect(Collectors.toList());  // java 8 stream api for mapping operation
		 namesList.forEach(System.out::println);
		 
		System.out.println("------------------------findAllById(-)-------------------------");
		service.fetchActorsByIds(List.of(9, 10, 51)).forEach(System.out::println);   //  forEach(-) method + method reference
		System.out.println("------------------------------------");
		service.fetchActorsByIds(Arrays.asList(19,110,21)).forEach(actor->System.out.println(actor));
		
		System.out.println("________________ findById(-)___________________");
		Optional<Actor> opt=service.fetchActorById(19);
	     if(opt.isPresent())
	    	 System.out.println("Actor Info ::"+opt.get());
	     else
	    	 System.out.println("actor Not found");
	     
	     System.out.println("_______________________");
	     
	     Optional<Actor> opt1=service.fetchActorById(9);
	     Actor actor=opt1.orElseThrow(()->new IllegalArgumentException("Actor not found"));
	     System.out.println("Actor info::"+actor);
		 
           System.out.println("_______________________");
	     
	     Optional<Actor> opt2=service.fetchActorById(29);
	     Actor actor1=opt2.orElse(new Actor());
	     System.out.println("Actor info::"+actor1);
	     
	     
      System.out.println("_______________________");
	     
	     Optional<Actor> opt3=service.fetchActorById(29);
	      if(opt3.isEmpty()) 
	    	  System.out.println("Actor not found");
	      else
	    	  System.out.println("Actor Info::"+opt3.get());
	      
	      System.out.println("_____________ findById(-) returning <T> directly");
	      System.out.println("Actor Info :"+service.showActorById(9));  */
		
		try {
	      
			/*System.out.println("____________partialupdate object operation______________");
			System.out.println(service.updateActorMobileNo(19, 88888888L));*/
	        
			/*System.out.println("____________full update object operation______________");
			Actor actor=new Actor(9,"Ranveer","Star Hero",77777999L);
			System.out.println(service.updateActor(actor));
			*/
	        
			/* System.out.println("____________Save or Update object operation____________");
			  // Actor actor=new Actor(9,"Ranveer","super Star",7777999L);
			    Actor actor=new Actor("Ranveer","super Star",7777999L);
			System.out.println(service.registerOrUpdateActor(actor));*/
			
			/*System.out.println("_________________deleteById(-)  operation___________");
			  System.out.println(service.removeActorById(9));*/
			
			/*System.out.println("_________________delete(-)  operation___________");
			 Actor actor=new Actor(10,null,null,null);
			  System.out.println(service.removeActor(actor));*/
	        
			/* System.out.println("_________________deleteById(-)  operation___________");
			  System.out.println(service.removeActorByAId(12));*/
			
			/*	System.out.println("_____________deleteAll()_________ method");
				System.out.println(service.removeAllActors());
			*/
			
			System.out.println("_____________deleteAllById()_________ method");
			  System.out.println(service.removeActorsByIds(List.of(3,4,10)));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}//main
}//class
