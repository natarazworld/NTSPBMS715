//CollectionMappingTestRunner.java
package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeInfo;
import com.nt.repository.EmployeeInfoRepository;

@Component
public class CollectionMappingTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeInfoRepository  empRepo;

	@Override
	public void run(String... args) throws Exception {
	   EmployeeInfo info=new EmployeeInfo();
	   info.setEname("raja"); info.setFriends(List.of("rani","ravi"));
	   info.setPhones(Set.of(9999999L,88888888L));
	   info.setIdDetails(Map.of("aadhar",4656656555L,"panno",6456564645L));
	   
	   // save the object
	  // System.out.println("Employee is saved with::"+empRepo.save(info).getEno()+" id value");
	   
	   // retriving  data
	   Iterable<EmployeeInfo> it=empRepo.findAll();
	   it.forEach(System.out::println);
		
	}

}
