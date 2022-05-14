//VoteElgibilityCheckingService.java
package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteElgibilityCheckingService  implements  InitializingBean, DisposableBean {
	private String name;
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
	
	//afterPropertiesSet() --init life cycle method
	@Override
	public  void  afterPropertiesSet() {
		System.out.println("VoteElgibilityCheckingService.afterPropertiesSet()");
		verifiedOn=new Date();  //initialization of left over property who are not in Injections
		if(name==null || age<=0)  //verification of injected values
			throw new IllegalArgumentException("invalid inputs (name or  age)");
	}
	
	
	//destroy() -- destroy life cycle method
	@Override
	public void destroy() {
		System.out.println("VoteElgibilityCheckingService.destroy()");
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
