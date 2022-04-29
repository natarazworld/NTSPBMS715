//Client App
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.nt.comps.Flipkart;
import com.nt.singleton.Printer;

public class  ScopesTestUsingAC{

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory  factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		//get Target spring bean class obj
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		Flipkart fpkt1=factory.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.hashCode()+"  "+fpkt1.hashCode());
		System.out.println("fpkt==fpkt1?"+(fpkt==fpkt1));
		
		System.out.println("-----------------------------");
		
			Printer p1=factory.getBean("p1",Printer.class);
			Printer p2=factory.getBean("p2",Printer.class);
			System.out.println(p1.hashCode()+"  "+p2.hashCode());
		
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
				                                             new double[] {1000.0,3000.0 ,500.0});
		System.out.println(msg);
	}//main
}//class
