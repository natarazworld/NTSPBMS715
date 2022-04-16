package com.nt.test;

import com.nt.comp.AadharDetails;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		 //create AadharDetails class obj
		 AadharDetails details=new AadharDetails(12345L, 20,99999L);  //dependent class obj
		 Person emp=new Employee("raja", "hyd", details,"HCL",67877.0);
		 System.out.println(emp);
		 
		 System.out.println("====================================");
		 AadharDetails details1=new AadharDetails(12311L, 20,91949L);  //dependent class obj
		 Person stud=new Student("ramesh", "vizag", details1,"java",1122);
		 System.out.println(stud);
		 
		 
	

	}

}
