// FinderMethodsTestRunner.java
package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;
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
		
		/*System.out.println("_______________");
		actorRepo.findByCategoryEqualsIgnoreCase("hero").forEach(System.out::println); */
		
		System.out.println("_______________");
		actorRepo.findByAnameLike("S%").forEach(System.out::println);
		actorRepo.findByAnameLike("%H").forEach(System.out::println);
		actorRepo.findByAnameLike("N%H").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAnameStartingWith("S").forEach(System.out::println);
		
		System.out.println("_______________");
		actorRepo.findByAnameContainingIgnoreCase("S").forEach(System.out::println);
		
		System.out.println("_________________");
		actorRepo.findByCategoryInIgnoreCaseOrderByAnameAsc(List.of("hero","villian","comedian")).forEach(System.out::println);
		System.out.println("_________________");
		actorRepo.findByAidGreaterThanEqualAndAidLessThanEqual(20, 50).forEach(System.out::println);
		System.out.println("_________________");
        actorRepo.findByStatusTrueOrCategoryEquals("hero").forEach(System.out::println);
        System.out.println("_________________");
        actorRepo.findByAidGreaterThanAndAidLessThanOrCategoryNotInIgnoreCase(10, 20, "villian","comedian").forEach(System.out::println);
        
        System.out.println("_________________");
        Iterable<ResultView>  it=actorRepo.findByCategoryEqualsIgnoreCase("Hero");
        it.forEach(view->{
        	System.out.println(view.getClass());
        	System.out.println(view.getAid()+"  "+view.getAname());
        });
        
        System.out.println("repository object class name::"+actorRepo.getClass());
        
        System.out.println("_________________");
        ResultView view= actorRepo.findByMobileNo(9999L);
        System.out.println(view.getAid()+"   "+view.getAname());
        
        System.out.println("_________________");
        Actor actor= actorRepo.findByMobileNoIs(9999L);
        System.out.println(actor);
        

			
		
	}

}
