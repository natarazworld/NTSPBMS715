//MysqlProcedureCallTestRunner.java
package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

@Component
public class MysqlProcedureCallTestRunner implements CommandLineRunner {
	@Autowired
	private  IEmployeeMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		service.fetchEmpsByDesgs("clerk", "manager").forEach(System.out::println);

	}

}
