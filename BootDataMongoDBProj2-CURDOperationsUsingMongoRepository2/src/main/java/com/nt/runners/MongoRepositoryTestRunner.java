package com.nt.runners;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	 @Autowired
	private IEmployeeMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*      //create Document  object
		 Employee  e=new Employee();
		 e.setEno(new Random().nextInt(10000));
		 e.setEname("lokesh"); e.setEadd("delhi");
		 e.setIsVaccinated(true); e.setSalary(90000.0);
		 System.out.println(service.registerEmployee(e));*/
		
		  Optional<Employee> opt=service.showEmployeeById(100);
		  if(opt.isPresent())
			   System.out.println("employee details ::"+opt.get());
		  else
			  System.out.println("Employee not found");
		         
		   }

}
