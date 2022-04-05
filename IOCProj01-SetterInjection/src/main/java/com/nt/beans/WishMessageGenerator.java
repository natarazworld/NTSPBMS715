package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//HAS- A property  (supporting  compostion or Injection)
	private  Date  date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0- param constructor");
	}
	
	//setter method supporting  Setter Injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date=date;
	}
	
	//b.method
	public String generateMessage(String user) {
		System.out.println(this.hashCode()+"   "+date.hashCode());
		System.out.println("WishMessageGenerator.generateMessage()");
		//get current hour of the day
		int  hour=date.getHours(); // givesn 0- 23
		//generate wish message
		 if(hour<12)
			 return "Good Morning:"+user;
		 else if(hour<16)
			 return "Good Afternonn:"+user;
		 else if(hour<20)
			 return "Good evening:"+user;
		 else
			 return "Good night:"+user;
	}
}
