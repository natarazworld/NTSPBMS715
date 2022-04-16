//Factory class
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {
	
	  //static factory method
	public  static  Flipkart  getInstance(String courierType) {
		// create Depedent class obj
		      Courier courier=null;
		      if(courierType.equalsIgnoreCase("dtdc"))
		    	 courier=new DTDC();
		      else if(courierType.equalsIgnoreCase("blueDart"))
		    	  courier=new BlueDart();
		      else 
		    	  throw new IllegalArgumentException("invalid courier type");
		     //create target class obj
		      Flipkart fpkt=new Flipkart();
		      //assign depdent class obj to target class obj
		      fpkt.setCourier(courier);
		      return fpkt;
	}

}
