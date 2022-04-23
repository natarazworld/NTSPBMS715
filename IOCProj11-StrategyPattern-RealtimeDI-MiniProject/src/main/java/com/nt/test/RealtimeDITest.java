package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		//read inputs from enduser   as String values
		Scanner sc=new Scanner(System.in);
		String name=null,addrs=null,pamt=null,rate=null,time=null;
		if(sc!=null) {
			System.out.println("Enter  customer name::");
			name=sc.next();
			System.out.println("Enter  customer address::");
			addrs=sc.next();
			System.out.println("Enter  customer principle amount::");
			pamt=sc.next();
			System.out.println("Enter  rate  of intrest::");
			rate=sc.next();
			System.out.println("Enter  time in months::");
			time=sc.next();
		}
		//prepare VO class obj having inputs
		CustomerVO  vo=new CustomerVO();
		vo.setCname(name);vo.setCadd(addrs);vo.setPamt(pamt);
		vo.setRate(rate); vo.setTime(time);
		//create  IOC container
		DefaultListableBeanFactory  factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Controller class obj
		MainController controller=factory.getBean("controller",MainController.class);
		try {
			//invoke the b.method
			String resultMsg=controller.processCustomer(vo);
			System.out.println(resultMsg);
		}
		catch(Exception e) {
			System.err.println("Problem in  custome registration::"+e.getMessage());
			e.printStackTrace();
		}
		

	}//main

}//class
