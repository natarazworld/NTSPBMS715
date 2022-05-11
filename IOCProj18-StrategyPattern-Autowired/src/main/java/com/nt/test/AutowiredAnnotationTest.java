//Client App
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class AutowiredAnnotationTest{

	public static void main(String[] args) {
		//create IOC container
		  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
				                                             new double[] {1000.0,3000.0 ,500.0});
		System.out.println(msg);
	}//main
}//class
