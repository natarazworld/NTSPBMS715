package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
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
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Controller class obj
		MainController controller=ctx.getBean("controller",MainController.class);
		try {
			//invoke the b.method
			String resultMsg=controller.processCustomer(vo);
			System.out.println(resultMsg);
		}
		catch(Exception e) {
			System.out.println("Problem in  custome registration::"+e.getMessage());
			e.printStackTrace();
		}
		

	}//main

}//class
