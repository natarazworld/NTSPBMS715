//main class cum Client App
package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj05ConfigurationPropertiesApplication.class, args);
		//get Company class obj ref
		Company company=ctx.getBean("comp",Company.class);
		System.out.println(company);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
