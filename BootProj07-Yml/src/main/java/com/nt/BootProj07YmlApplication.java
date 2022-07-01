package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootProj07YmlApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj07YmlApplication.class, args);
		//get Customer obj ref
		Customer customer=ctx.getBean("cust",Customer.class);
		System.out.println(customer);
		//close IOC container
		((ConfigurableApplicationContext) ctx).close();
	}

}
