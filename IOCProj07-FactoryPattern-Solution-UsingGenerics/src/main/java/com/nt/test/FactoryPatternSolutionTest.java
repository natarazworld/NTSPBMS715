//FactoryPatternSolutionTest.java
package com.nt.test;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		try {
		 //use Factory to create  Employee class obj
		 Employee emp=PersonFactory.getPerson(Employee.class);
		 System.out.println(emp);
		 System.out.println(emp.sayHello("raja"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		try {
		 System.out.println("====================================");
		 Customer cust=PersonFactory.getPerson(Customer.class);
		 System.out.println(cust);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 
	

	}//methid

}//class
