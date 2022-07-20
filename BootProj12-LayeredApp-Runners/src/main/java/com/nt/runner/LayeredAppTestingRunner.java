//LayeredAppTestingRunner.java
package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@Component
public class LayeredAppTestingRunner implements CommandLineRunner {
	@Autowired
	private  PayrollOperationsController controller;
	
	public LayeredAppTestingRunner() {
		System.out.println("LayeredAppTestingRunner:: 0-param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("LayeredAppTestingRunner.run()");
		try {
			List<Employee> list=controller.showEmployeesByDesgs("CLERK","MANAGER","SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Internal prolbme --try again ::"+e.getMessage());
		}//catch

	}//run(-)

}//classs
