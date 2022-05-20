//DependencyLookupTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CricketBat;
import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		//create  IOC container
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Target class obj
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		//invoke the b.methods
		  cktr.batting();
		  cktr.bowling();
		  cktr.fielding();
		  
		  //close the container
		   ctx.close();

	}//main
}//class
