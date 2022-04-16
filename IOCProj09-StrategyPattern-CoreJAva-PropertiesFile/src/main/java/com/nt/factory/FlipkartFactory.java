//Factory class
package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.Courier;
import com.nt.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {
	 private static Properties props;
	 static {
		 System.out.println("FlipkartFactory.static clock");
		 try {
		 // Locate properties file through stream
		   InputStream is=new FileInputStream("src/main/java/com/nt/commons/info.properties");
		   // Load properties file content to java.util.Properties class obj
		   props=new Properties();
		   props.load(is);
		 }//try
		 catch(IOException ioe) {
			 ioe.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		   
	 }//static block
	
	  //static factory method
	public  static  Flipkart  getInstance()throws Exception {
		System.out.println("FlipkartFactory.getInstance()");
		    //get Dependent class name
		       String courierClassName=props.getProperty("courier.classname");
		       //Load the depedent class 
		       Class c=Class.forName(courierClassName);
		       //create the object for loaded class
		       Constructor<Courier> cons[]=c.getDeclaredConstructors();
		       Courier courier=cons[0].newInstance();
		
		     //create target class obj
		      Flipkart fpkt=new Flipkart();
		      //assign depdent class obj to target class obj
		      fpkt.setCourier(courier);
		      return fpkt;
	}//method

}//class
