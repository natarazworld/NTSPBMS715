//LookupMethodInjectionTest.java (client app)
package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CricketBat;
import com.nt.sbeans.Cricketer;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		//create  IOC container
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Target class obj
		Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		System.out.println(cktr.getClass()+"   "+cktr.getClass().getSuperclass());
		System.out.println(Arrays.toString(cktr.getClass().getDeclaredMethods()));
		//invoke the b.methods
		  cktr.batting();
		  cktr.bowling();
		  cktr.fielding();
		  
		  //close the container
		   ctx.close();

	}//main
}//class
