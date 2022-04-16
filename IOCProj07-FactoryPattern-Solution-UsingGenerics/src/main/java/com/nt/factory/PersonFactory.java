//PersonFactory.java
package com.nt.factory;


import java.lang.reflect.Constructor;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

//Factory Pattern
public class PersonFactory {
	
	 //static  factory method   (having generic/common retur type)
	public  static <T extends Person>  T  getPerson(Class<T> clazz)throws Exception {
			
		
		 Constructor cons[]=clazz.getDeclaredConstructors();
		  Object obj=null;
		 if(clazz==Employee.class) {
			 AadharDetails details=new AadharDetails(123456L, 20, 9454354L);
		    obj=cons[0].newInstance("raja","hyd",details,"HCL",343555.0);
		 }
		 else if(clazz==Customer.class) {
			 AadharDetails details=new AadharDetails(123451L, 21, 9414354L);
			 obj=cons[0].newInstance("ramesh","vizag",details,5454,54354.7);
		 }
		 else if(clazz==Student.class) {
			 AadharDetails details=new AadharDetails(113451L, 31, 9412354L);
			 obj=cons[0].newInstance("suresh","delhi",details,"java",11);
		 }
		 else {
			 throw new IllegalArgumentException("Invalid Person Type");
		 }
		 return (T) obj;
	}//method

}//class
