//ConstructorInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Student;
import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file in Resource object
		//FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"); 
		FileSystemResource res=new FileSystemResource("G:\\Worskpaces\\Spring\\NTSPBMS715\\IOCProj03-ConstructorInjection\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		  //ClassPathResource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//ClassPathResource res=new ClassPathResource("applicationContext.xml");
		System.out.println("---------------------1------------------------");
		//create BeanFactory  spring container (IOC container)
		XmlBeanFactory  factory=new XmlBeanFactory(res);
		System.out.println("____________2___________________");
		//get Target spring bean class obj injected with Dependent spring bean class obj
		   Object object=factory.getBean("wmg");
		   //type casting
		   WishMessageGenerator generator=(WishMessageGenerator)object;
		   System.out.println("_______________________________");
		   // invoke the b.method
		   String msg=generator.generateMessage("raja");
		   System.out.println("Wish Message is ::"+msg);
		   System.out.println("===========================");
		    Student stud=(Student)factory.getBean("st");
		   System.out.println("stud obj data ::"+stud);
		   
	}//main
}//class
