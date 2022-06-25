//BootProj01BasicDiApplication.java (main class cum Configuration class)
package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {

	public BootProj01BasicDiApplication() {
		System.out.println("BootProj01BasicDiApplication.BootProj01BasicDiApplication()");
	}
	
	
	// pre-defined class as springBean using @Bean method
	//@Bean(name="ldt")
	@Bean
	public  LocalDateTime createLDT() {
		System.out.println("BootProj01BasicDiApplication.createLDT()");
		return  LocalDateTime.now(); //static factory method giving 
		                                                          //LocalDateTime class obj having system date and time
	}
	
	
	
	public static void main(String[] args) {
		  //get  IOC container  from SpringApplication.run(-,-)
		ApplicationContext ctx=SpringApplication.run(BootProj01BasicDiApplication.class, args);
		  //  get  Target spring bean class obj ref
		 WishMessageGenerator generator=ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
		 //invoke the b.method
		 String result=generator.showWishMessage("raja");
		 System.out.println("result :::"+result);
		 System.out.println("_____________");
		 LocalDateTime ldt=ctx.getBean("createLDT",LocalDateTime.class);
		 System.out.println(ldt);
		 
		 //close the container  (optional but recomanded)
	     ((ConfigurableApplicationContext) ctx).close();
		
	}

}
