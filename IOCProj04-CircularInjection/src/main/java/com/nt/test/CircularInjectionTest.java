//CircularInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;

public class CircularInjectionTest {

	public static void main(String[] args) {
		//create  IOC container
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nt/config/applicationContext.xml"));
		//get Spring bean class obj ref
		A  a1=(A)factory.getBean("a1");
		System.out.println(a1);
		
		   
	}//main
}//class
