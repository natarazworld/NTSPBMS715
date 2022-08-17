//CallingPL_ProcedureTestRunner.java
package com.nt.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;

@Component
public class CallingPL_ProcedureTestRunner  implements CommandLineRunner {
  @Autowired
	private EntityManager  manager;
  
	@Override
	public void run(String... args) throws Exception {
		//create StroredProcdureQuery Object having PL/SQL Procedure name , result type
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_ACTORS_BY_CATEGORIES", Actor.class);
		// register both IN ,OUT params  of PL/SQL procedure
		query.registerStoredProcedureParameter(1, String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Actor.class,ParameterMode.REF_CURSOR); //registering out param
		//set values to IN params
		query.setParameter(1, "CLERK");
		query.setParameter(2, "MANAGER");
		//call PL/SQL procedure
		List<Actor> list=query.getResultList();
		//proecess the result
		list.forEach(System.out::println);
		
	}//main

}//class
