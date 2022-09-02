package com.nt.runners;

import java.util.UUID;

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
		//========= save document ==========
		/*Employee e=new Employee();
		e.setEno(104); e.setEname("suresh"); e.setEadd("delhi"); e.setSalary(90000.0); e.setIsVaccinated(true);
		System.out.println(service.saveEmployee(e));*/
         //  ===== list all documents ===========
		  // service.showAllEmployees().forEach(System.out::println);
		 //  ======= findById(-) method call ======
		   // System.out.println("Doc info:"+service.searchEmployeeById("630d6dccfff45b5f73392a75"));
		   
		   //  =======Updating the Document ======
		      // System.out.println(service.modifyEmployeeById("630d6dccfff45b5f73392a75", 27000.0));  
		
		  //====== Deleting the document=======
		         //System.out.println(service.removeEmployeeById("630d6dccfff45b5f73392a75"));
		
		   // find all the docs
		       // service.showAllEmployees(true, "ename").forEach(System.out::println);
		        
		        
		        Employee e=new Employee();
		        e.setId(UUID.randomUUID().toString());
				e.setEno(156); e.setEname("mahesh"); e.setEadd("mumbai"); e.setSalary(90000.0); e.setIsVaccinated(true);
				System.out.println(service.saveEmployee(e));
		         
		   }

}
