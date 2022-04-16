package com.nt.test;

import java.util.Arrays;

public class LangClassTest {

	public static void main(String[] args) {
	   Class c1=Test.class;
	   System.out.println("c1 obj data::"+c1.toString()+" c1 obj class name"+c1.getClass());
	   System.out.println("Test class super class name::"+c1.getSuperclass());
	   System.out.println("Test class implemented interface names::"+Arrays.toString(c1.getInterfaces()));
	}

}
