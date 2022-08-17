
//PersonInfoMgmtServiceImpl.java
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repository.IPersonInfoRepostiroy;

@Service("personService")
public class PersonInfoMgmtServiceImpl implements IPersonInfoMgmtService {
	@Autowired
	private IPersonInfoRepostiroy  personRepo;

	@Override
	public String registerPerson(PersonInfo info) {
		
		return "person is saved with the id value::"+personRepo.save(info).getPid();
	}

	@Override
	public PersonInfo getPersonByPid(int pid) {
	   return  personRepo.findById(pid).orElseThrow(()->new IllegalArgumentException("invalid pid"));
		 
	}

}
