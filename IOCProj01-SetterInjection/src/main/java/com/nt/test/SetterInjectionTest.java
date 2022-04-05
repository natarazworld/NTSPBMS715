//SetterInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file in Resource object
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"); 
		System.out.println("---------------------1------------------------");
		//create BeanFactory  spring container (IOC container)
		XmlBeanFactory  factory=new XmlBeanFactory(res);
		System.out.println("____________2___________________");
		//get Target spring bean class obj injected with Dependent spring bean class obj
		   Object object=factory.getBean("wmg");
		   Object object1=factory.getBean("wmg");
		   System.out.println(object.hashCode()+"   "+object1.hashCode());
		  //type casting
		   WishMessageGenerator generator=(WishMessageGenerator)object;
		   System.out.println("_______________________________");
		   // invoke the b.method
		   String msg=generator.generateMessage("raja");
		   System.out.println("Wish Message is ::"+msg);
		   System.out.println("_______________________________"); 
	}//main
}//class
