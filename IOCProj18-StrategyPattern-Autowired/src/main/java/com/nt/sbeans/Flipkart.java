//Target class
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {    
	 //HAS -A property 
	@Autowired
	@Qualifier("bDart")
	private   Courier courier;   
	
	@Autowired
	public Flipkart(@Qualifier("fFlight") Courier courier) {
		this.courier=courier;
		System.out.println("Flipkart::1-param constructor ::"+courier.getClass());
	}
	
	
	
	
	@Autowired
	@Qualifier("dhl")
	public void assign(Courier courier) {
		System.out.println("Flipkart.assign()");
		this.courier=courier;
		System.out.println("Flipkart.assingin()"+courier.getClass());
	}
   
	
	@Autowired
	@Qualifier("dtdc")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()"+courier.getClass());
		this.courier=courier;
		System.out.println("Flipkart.setCourier()"+courier.getClass());
	}

   
   
   public  String shopping( String items[] ,double prices[]) {
	   System.out.println("Flipkart.shopping()");
	    //calc bill amount
	    double billAmt=0.0;
	    for(double p:prices) {
	    	billAmt+=p;
	    }
	    //generate order id
	    int oid=new Random().nextInt(100000);
	    //use  courier
	     String  msg=courier.deliver(oid);
	     return  Arrays.toString(items)+" are purchased having bill amount"+billAmt+" ---->"+msg;
   }
}
