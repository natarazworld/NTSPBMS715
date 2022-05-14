//BeanLifeCycleTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteElgibilityCheckingService;

public class BeanLifeCycleTest 
{
    public static void main( String[] args )
    {
    	//create  Container
    	ClassPathXmlApplicationContext ctx=
    			  new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	//get spring bean class obj ref
    	VoteElgibilityCheckingService service=ctx.getBean("voting",VoteElgibilityCheckingService.class);
    	//invoke the b.method
    	   String result=service.checkVotingElgibility();
    	   System.out.println(result);
    	
    	   //close container
    	   ctx.close();
   
    }
}
