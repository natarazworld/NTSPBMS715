//QueryMethodsTestRunner .java
package com.nt.runners;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	 @Autowired
	private IEmployeeMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*service.showEmpDataByAddrs("hyd").forEach(row->{
			  for(Object val:row) {
				  System.out.print(val+" ");
			  }
			  System.out.println();
		});*/
		//service.showEmpAllDataByAddrs("hyd").forEach(System.out::println);
		System.out.println("=============================");
		//service.showEmpAllDataByAddrsAndName("hyd", "rajesh").forEach(System.out::println);
		System.out.println("=============================");
		//service.showEmpAllDataBySalaryRange(80000,200000).forEach(System.out::println);
		System.out.println("=============================");
		//service.showEmpAllDataByAddresses("hyd", "delhi").forEach(System.out::println);	   
		
		/*System.out.println("===========containing==================");
		service.showEmpAllDataByEnameChars("r").forEach(System.out::println);
		System.out.println("===========starts With==================");
		service.showEmpAllDataByEnameChars("^r").forEach(System.out::println);
		System.out.println("===========endswith==================");
		service.showEmpAllDataByEnameChars("h$").forEach(System.out::println);*/
		
		
		//System.out.println("Emps count having salary in range(10k to 100k)"+service.fetchEmpsCountBySalaryRange(10000, 100000));
		
		//service.fetchEmpsDataByEnameSorted().forEach(System.out::println);
		
		//System.out.println(service.removeEmpsWithNoEmailId()+" docs are deleted becoz of no email id");
				
			System.out.println(service.doesCompanyHavingApprantees());	
			System.out.println("______________");
			System.out.println(service.doesCompanyHavingEmpsInSalaryRange(100000.0, 1000000.0));
			
	}
	

}
