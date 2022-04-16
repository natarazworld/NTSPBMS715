 //ReflectionAPI_PrivateAccess_Instantiation.java
package com.nt.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_PrivateAccess_Instantiation {

	public static void main(String[] args) {
		 //  Test t=new Test();  //invalid
		
			try {
				//Load the class at runtime
				Class  c=Class.forName(args[0]);

				Constructor cons[]=c.getDeclaredConstructors();
				cons[0].setAccessible(true);
				Object obj2=cons[0].newInstance(); //uses 0-param constructor
				System.out.println("obj2::"+obj2.toString());
				
				System.out.println("----------------------------------------");
				cons[1].setAccessible(true);
				Object obj3=cons[1].newInstance(10,20); //uses 2-param constructor
				System.out.println("obj3::"+obj3.toString());
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}
	}//main
}//class
