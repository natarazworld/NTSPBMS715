//main class
package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02DiApplication {

	public static void main(String[] args) {
		  //get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj02DiApplication.class, args);
		  //get target class obj ref  
		Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
		  //invoke b.method
		  vehicle.jounery("hyd","delhi");
		  
		  //close the IOC container
		   ((ConfigurableApplicationContext) ctx).close ();
	}

}
