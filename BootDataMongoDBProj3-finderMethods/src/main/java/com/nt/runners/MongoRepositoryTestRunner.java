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
		 service.searchEmployeeBySalaryRange(10000.0, 200000.0).forEach(System.out::println);
		 
		 System.out.println("employee info::"+service.searchEmployeeByEmail("raja@gmail.com"));
		         
		   }

}
