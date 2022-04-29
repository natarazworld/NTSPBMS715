package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	public static void main(String[] args) {
		 //create  IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Spring Bean class objs
		Class clazz=factory.getBean("c1",Class.class);
		System.out.println("clazz obj data::"+clazz.toString()+"  "+clazz.getClass());
		
		System.out.println("------------------------------------");
		Calendar cal=factory.getBean("cal",Calendar.class);
		System.out.println("cal obj data::"+cal.toString()+"  "+cal.getClass());

		System.out.println("-----------------------------------------");
		Properties props=factory.getBean("props",Properties.class);
		System.out.println("props obj data:"+props.toString()+"  props obj class"+props.getClass());
		
		System.out.println("=========================================");
		 String ss=factory.getBean("s2",String.class);
		 System.out.println("ss obj data::"+ss.toString()+" ss obj type: "+ss.getClass());
		 
		 System.out.println("-----------------------------");
		 String ss1=factory.getBean("s3",String.class);
		 System.out.println("ss1 obj data::"+ss1.toString()+" ss1 obj class:: "+ss1.getClass());
		 
		
	}//main
}//class
