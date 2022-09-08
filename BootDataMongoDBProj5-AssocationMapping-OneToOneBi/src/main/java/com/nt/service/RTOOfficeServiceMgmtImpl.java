//RTOOfficeServiceMgmtImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.repository.IDrivingLicenseRepository;
import com.nt.repository.IPersonRepository;

@Service("RTOService")
public class RTOOfficeServiceMgmtImpl implements IRTOOfficeMgmtService {
	@Autowired
   private IPersonRepository  personRepo;
	@Autowired
   private  IDrivingLicenseRepository  licenseRepo;
   
	@Override
	public String saveDataUsingPerson(Person per) {
		
		return  "Person object is saved having id value :"+personRepo.save(per).getPid();
	}

	@Override
	public String saveDataUsingDrivingLicense(DrivingLicense license) {
		
		return  "License  object is saved having id value :"+licenseRepo.save(license).getLno();
	}

	
	@Override
	public List<Person> showDataUsingPerson() {
		
		return personRepo.findAll();
	}
	
	@Override
	public List<DrivingLicense> showDataUsingDrivingLicense() {
		
		return licenseRepo.findAll();
	}
}
