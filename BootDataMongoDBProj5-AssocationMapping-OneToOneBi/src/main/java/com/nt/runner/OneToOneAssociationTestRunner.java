package com.nt.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.IRTOOfficeMgmtService;

@Component
public class OneToOneAssociationTestRunner implements CommandLineRunner {
	@Autowired
	private IRTOOfficeMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		//====  save Object using Parent to Child =========
		/*//prepare objects 
		   //parent
		 Person  per=new Person();
		 per.setPid(new Random().nextInt(10000));
		 per.setPname("rajesh");
		 per.setAddrs("hyd");
		   //child
		 DrivingLicense license=new DrivingLicense();
		 license.setLno(new Random().nextInt(100000));
		 license.setLicenseType("LMV"); license.setExpiryDate(LocalDateTime.of(2042,10,23,14,20));
		 //map the objs
		   per.setLicenseDetails(license); 
		   
		   //save obj
		   System.out.println(service.saveDataUsingPerson(per));*/
		
		/*//====  save Object usingChild  to Parent =========
		//prepare objects 
		   //parent
		 Person  per=new Person();
		 per.setPid(new Random().nextInt(10000));
		 per.setPname("suresh");
		 per.setAddrs("delhi");
		   //child
		 DrivingLicense license=new DrivingLicense();
		 license.setLno(new Random().nextInt(100000));
		 license.setLicenseType("HMV"); license.setExpiryDate(LocalDateTime.of(2032,10,23,14,20));
		 //map the objs
		   license.setPersonDetails(per);
		   
		   //save obj
		   System.out.println(service.saveDataUsingDrivingLicense(license));*/
		
		 // =======  select operation using Parent===========
		  service.showDataUsingPerson().forEach(per->{
			  System.out.println("Parent ::"+per);
			  DrivingLicense  license=per.getLicenseDetails();
			  System.out.println("child ::"+license);
		  });
		  
		  System.out.println("____________________");
		  service.showDataUsingDrivingLicense().forEach(license->{
			  System.out.println("Child :"+license);
			  Person per=license.getPersonDetails();
			  System.out.println("parent ::"+per);
		  });
           
	}

}
