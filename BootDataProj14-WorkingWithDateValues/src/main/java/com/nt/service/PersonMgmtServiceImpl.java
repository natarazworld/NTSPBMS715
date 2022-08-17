//PersonMgmtServiceImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repository.IPersonInfoRepository;

@Service("personService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	@Autowired
	private IPersonInfoRepository  personRepo;
	

	@Override
	public String registerPerson(PersonInfo person) {
		return "Person is saved with the id "+ personRepo.save(person).getPid();
		
		
	}

	@Override
	public List<PersonInfo> fetchAllPerson() {
		
		return personRepo.findAll();
	}

}
