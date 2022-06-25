package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		 //get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj04ValueAnnotationSpelApplication.class, args);
		//get Hotel object ref
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
