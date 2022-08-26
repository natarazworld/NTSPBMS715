//AssociationMappingTestRunner.java
package com.nt.runners;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IPersonMgmtService;

@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*//save Object Operation (parent to child)
		 Person per=new Person();
		 per.setPname("raja"); per.setPaddrs("hyd");
		 
		 PhoneNumber ph1=new PhoneNumber();
		 ph1.setNumber_type("office"); ph1.setPhone_number(9999999L); ph1.setProvider("airtel");
		 
		 PhoneNumber ph2=new PhoneNumber();
		 ph2.setNumber_type("residence"); ph2.setPhone_number(88888888L); ph2.setProvider("VI");
		   //map the objs  (parent to child and child to parent)
		      ph1.setPerson(per); ph2.setPerson(per);  //childs to parent  (many to one)
		     Set<PhoneNumber> phonesSet=Set.of(ph1,ph2);
		     per.setPhones(phonesSet);  //parent to childs  (one to many)
		     
		      try {
		    	  System.out.println(service.saveDataUsingPerson(per));
		      }
		      catch(Exception e) {
		    	  e.printStackTrace();
		      }
		*/
		/*//save Object Operation ( child to parent)
		 Person per=new Person();
		 per.setPname("mahesh"); per.setPaddrs("delhi");
		 
		 PhoneNumber ph1=new PhoneNumber();
		 ph1.setNumber_type("office"); ph1.setPhone_number(999666677L); ph1.setProvider("airtel");
		 
		 PhoneNumber ph2=new PhoneNumber();
		 ph2.setNumber_type("residence"); ph2.setPhone_number(777777637L); ph2.setProvider("VI");
		   //map the objs  (parent to child and child to parent)
		      ph1.setPerson(per); ph2.setPerson(per);  //childs to parent  (many to one)
		     Set<PhoneNumber> phonesSet=new HashSet<PhoneNumber>();
		      phonesSet.add(ph1); phonesSet.add(ph2);
		     per.setPhones(phonesSet);  //parent to childs  
		     
		     try {
		    	 System.out.println(service.saveDataUsingPhoneNumber(phonesSet));
		     }
		     catch(Exception e) {
		    	 e.printStackTrace();
		     }
		*/

		/*	service.loadDataUsingParent().forEach(per->{
				System.out.println("parent ::"+per);
				Set<PhoneNumber> childs=per.getPhones();
				childs.forEach(ph->{
					 System.out.println("Child::"+ph);
				 });
				 System.out.println("_____________");
			});*/
		
		/* service.loadDataUsingChild().forEach(ph->{
			 System.out.println("Child::"+ph);
			 //get associated parent
			 Person person=ph.getPerson();
			 System.out.println("parent :: "+person);
			 System.out.println("_________________");
		 });*/
		
          // System.out.println(service.deletePersonAndHisPhoneNumbersByPid(1000));		 
		
		//System.out.println(service.deleltePhoneNumbersAndTheirPersonByRegnos(List.of(25,26)));
		
		   //System.out.println(service.deleteAllPhoneNumbersOfaPerson(1001));
		
		  //System.out.println(service.removeAllPhoneNumbersOfaPersonByPid(1036));
			
				service.getDataUsingPersonByJoins().forEach(row->{
					for(Object obj:row) {
						System.out.print(obj+" ");
					}
					System.out.println();
				});
		
			/*service.getData1UsingPersonByJoins().forEach(per->{
			  System.out.println("parent ::"+per);
			  Set<PhoneNumber> childs=per.getPhones();
			  childs.forEach(ph->{
				  System.out.println("Child ::"+ph);
			  });
			  System.out.println("___________");
			});*/

	}// run(-)

}// class
