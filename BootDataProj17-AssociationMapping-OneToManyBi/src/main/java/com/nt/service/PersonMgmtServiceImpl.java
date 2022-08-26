//PersonMgmtServiceImpl.java
package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service("PersonService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	@Autowired
	private  IPersonRepository  personRepo;
	@Autowired
	private  IPhoneNumberRepository phoneNumberRepo;

	@Override
	public String saveDataUsingPerson(Person per) {
		return "Person and his phonenumbers are saved with "+ personRepo.save(per)+" id  value";
		
	}

	/*@Override
	public String saveDataUsingPhoneNumber(Set<PhoneNumber> phonesSet) {
	      List<String> msgs=new ArrayList();
		if(phonesSet.size()>0) {
		 for(PhoneNumber ph: phonesSet) {
			 msgs.add(" phonenumbers mapped with Person are saved with "+ phoneNumberRepo.save(ph)+" id  value");
		   }
		}
		
		return msgs.toString();
	}//method */
	
	
	public String saveDataUsingPhoneNumber(Set<PhoneNumber> phonesSet) {
		
		int count=phoneNumberRepo.saveAll(phonesSet).size();
		return  count+" no.of  PhoneNumber objs mapped to Person obj are saved";
		
	}

	@Override
	public Iterable<Person> loadDataUsingParent() {
		Iterable<Person> it=personRepo.findAll();
		
		return  it;
	}
	
	
	@Override
	public Iterable<PhoneNumber> loadDataUsingChild() {
		
		return phoneNumberRepo.findAll();
	}
	
	
	@Override
	public String deletePersonAndHisPhoneNumbersByPid(int pid) {
		// Load Person obj and his PhoneNumbers obj
		   Optional<Person> opt=personRepo.findById(pid);
		    if(opt.isEmpty()) {
		    	return  "person not found";
		    }
		    else {
		    	// delete Person and his PhoneNumber objs
		    	 Person per=opt.get();
		    	  personRepo.delete(per);
		    	  return  pid+" Person and his PhoneNumbers are deleted";
		    }
		
	}//method
	
	
	@Override
	public String deleltePhoneNumbersAndTheirPersonByRegnos(List<Integer> regNos) {
		   //Load PhoneNumbers by regNos
		   List<PhoneNumber> listPhones=phoneNumberRepo.findAllById(regNos);
		   if(listPhones.size()==0) {
			     return "Given PhoneNumbers are not found";
		   }
		   else {
			   phoneNumberRepo.deleteAll(listPhones);
			   return  listPhones.size()+" phoneNumbers and the associated parent obj/Person is deleted";
		   }
		
	}//methid
	
	@Override
	public String deleteAllPhoneNumbersOfaPerson(int pid) {
		// Load Person obj and his PhoneNumbers obj
		   Optional<Person> opt=personRepo.findById(pid);
		    if(opt.isEmpty()) {
		    	return  "person not found";
		    }
		    else {
		    	//get Parent obj
		    	Person per=opt.get();
		    	// get All PhoneNumbers (child objs)of a Person
		    	Set<PhoneNumber> phones=per.getPhones();
		    	int count=phones.size();
				phoneNumberRepo.deleteAll(phones);
				//resave the parent obj with out linked with childs
				per.setPhones(null);		
				personRepo.save(per);
				
				return  count+" no.of PhoneNumbers are deleted for the Peson ::"+pid;
		    	
		    }//else
		
	}//method
	
	@Override
	public String removeAllPhoneNumbersOfaPersonByPid(int pid) {
		//Load Parent obj
		 Optional<Person>  opt=personRepo.findById(pid);
		 if(opt.isEmpty())
			 return "Person not found";
		 else {
			 int count=phoneNumberRepo.deleteAllPhoneNumbersOfaPersonByPid(pid);
			 return  count+" no.of phoneNumbers are deleted";
		 }
		
	
	}//method
	
	
	@Override
	public List<Object[]> getDataUsingPersonByJoins() {
		
		return personRepo.fetchDataUsingJoinsByParent();
	}
	
	
	@Override
	public List<Person> getData1UsingPersonByJoins() {
			return personRepo.fetchData1UsingJoinsByParent();
	}
	

}//class
