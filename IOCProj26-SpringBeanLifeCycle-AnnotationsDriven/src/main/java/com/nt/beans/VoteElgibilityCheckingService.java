//VoteElgibilityCheckingService.java
package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource(value = "com/nt/commons/Info.properties")
public class VoteElgibilityCheckingService  {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private  int age;
	private  Date verifiedOn;
	
	public VoteElgibilityCheckingService() {
		System.out.println("VoteElgibilityCheckingService:: 0-param constructor");
	}
	
	public void setName(String name) {
		System.out.println("VoteElgibilityCheckingService.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteElgibilityCheckingService.setAge()");
		this.age = age;
	}
	
	//init life cycle method
	@PostConstruct
   public  void  myInit() {
		System.out.println("VoteElgibilityCheckingService.myInit() -- @PostConstruct method");
		verifiedOn=new Date();  //initialization of left over property who are not in Injections
		if(name==null || age<=0)  //verification of injected values
			throw new IllegalArgumentException("invalid inputs (name or  age)");
	}
	
	
	// destroy life cycle method
	@PreDestroy
	public void mydestroy() {
		System.out.println("VoteElgibilityCheckingService.myDestroy()-- @PreDestroy method");
		name=null;
		age=0;
		verifiedOn=null;
		
	}
	
	//b.method
	public  String checkVotingElgibility() {
		System.out.println("VoteElgibilityCheckingService.checkVotingElgibility()::"+verifiedOn);
		if(age>=18)
			return "Mr./Miss/Mrs. "+name +" your  elgible for Voting";
		else 
			return "Master. "+name +" your not  elgible for Voting";
	}
	
}//class
