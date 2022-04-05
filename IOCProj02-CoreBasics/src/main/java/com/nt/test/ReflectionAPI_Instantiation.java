package com.nt.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instantiation {

	public static void main(String[] args) {
		try {
			//Load the class at runtime
			Class  c=Class.forName(args[0]);
			// create object dynamically  (option1)
			Object obj1=c.newInstance();  //uses 0-param constructor
			System.out.println("obj1::"+obj1.toString()); 
			System.out.println("----------------------------------------");
			Constructor cons[]=c.getDeclaredConstructors();
			Object obj2=cons[0].newInstance(); //uses 0-param constructor
			System.out.println("obj2::"+obj2.toString());
			System.out.println("----------------------------------------");
			Object obj3=cons[1].newInstance(10,20); //uses 2-param constructor
			System.out.println("obj3::"+obj3.toString());
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}

	}//main
}//class
