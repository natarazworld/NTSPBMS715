//SetterInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//create  IOC container (BeanFactory container)
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader  reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("____________2___________________");
		  WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
		   // invoke the b.method
		   String msg=generator.generateMessage("raja");
		  System.out.println("Wish Message is ::"+msg);
		   System.out.println("_______________________________"); 
	}//main
}//class
