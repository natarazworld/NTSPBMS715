//WishMessageGenerator.java  (target class)
package com.nt.sbeans;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("wmg")
@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime  ldt;  // HAS- A property
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
	
	                 //B.method
	public  String   generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		 // get current hour of the day
		  int hour=ldt.getHour();  //24 hours format
		  //generate the wish message
		   if(hour<12)
			   return "Good Morning::"+user;
		   else if(hour<16)
			   return "Good AfterNoon::"+user;
		   else if(hour<20)
			    return  "Good Evening::"+user;
		   else 
			   return  "Good Night::"+user;
	}//method
}//class
