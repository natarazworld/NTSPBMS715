//Target class
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {    //final class -- rule3
	 //HAS -A property  (rule1)
	private   Courier courier;   // rule2  (interface type reference)
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
   
   public   void  setCourier(Courier courier) {
	   System.out.println("Flipkart.setCourier(-)");
	   this.courier=courier;
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
