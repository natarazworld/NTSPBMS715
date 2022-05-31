//JavaConfigAppTest.java
package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigAppTest {

	public static void main(String[] args) {
	     //create  IOC container
		 AnnotationConfigApplicationContext  ctx=new 
				        AnnotationConfigApplicationContext(AppConfig.class);
		 //get  Target Spring bean class obj ref
		 //WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 WishMessageGenerator generator=ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
		  //invoke the b.method
		 String result=generator.generateWishMessage("raja");
		 System.out.println("Result is::"+result);
		 
		 System.out.println("________________");
		 LocalDateTime  ldt=ctx.getBean("createLocalDateTime",LocalDateTime.class);
		 System.out.println(ldt);
		 
		 //close container
		  ctx.close();

	}

}
