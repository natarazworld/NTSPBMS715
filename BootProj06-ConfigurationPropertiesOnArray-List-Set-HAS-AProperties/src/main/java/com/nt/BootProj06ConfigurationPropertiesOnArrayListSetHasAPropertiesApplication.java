package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication.class, args);
		//get Employee obj ref
		Employee emp=ctx.getBean("emp",Employee.class);
		// display the object data
		System.out.println(emp);
	}//main
}//class
