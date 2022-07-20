//ClientApp
package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@SpringBootApplication
public class BootDataJpaProj1CrudRepositoryApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
		//  get Service class obj ref
		IActorMgmtService service=ctx.getBean("ActorService",IActorMgmtService.class);
		/*//invoke the method
		try {
			//create Actor class obj
			Actor actor=new Actor();
			actor.setAid(3);
			actor.setAname("Rajani"); actor.setCategory(" Star"); actor.setMobileNo(99999999L);
			String resultMsg=service.registerActor(actor);
			System.out.println(resultMsg);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				List<Actor> actorsList=List.of(new Actor(1001,"salman","hero",999889L),
						                                                   new Actor(1002,"ranveer","hero",99967889L),
						                                                   new Actor(1003,"vijay","hero",999673589L));  // java 9 feature
				String resultMsg=service.registerActorsGroup(actorsList);
				System.out.println(resultMsg);
			}//try
			catch(DataAccessException dae) {
				dae.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		
		/*try {
			List<Actor> actorsList=List.of(new Actor("salman","hero",999889L),
					                                                   new Actor("ranveer","hero",99967889L),
					                                                   new Actor("vijay","hero",999673589L));  // java 9 feature
			String resultMsg=service.registerActorsGroup(actorsList);
			System.out.println(resultMsg);
		}//try
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				System.out.println("records count is ::"+service.fetchRecordsCount());
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
			   System.out.println(" 56  AID  actor avaiable?"+service.isActorAvaiable(56));	
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
