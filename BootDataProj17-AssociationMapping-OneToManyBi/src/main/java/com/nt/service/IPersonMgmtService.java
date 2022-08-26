//IPersonMgmtService.java
package com.nt.service;

import java.util.List;
import java.util.Set;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IPersonMgmtService {
     public String  saveDataUsingPerson(Person per);
     public  String saveDataUsingPhoneNumber(Set<PhoneNumber> phoneSet);
     public   Iterable<Person>  loadDataUsingParent();
     public   Iterable<PhoneNumber>  loadDataUsingChild();
     public    String  deletePersonAndHisPhoneNumbersByPid(int pid);
     public    String   deleltePhoneNumbersAndTheirPersonByRegnos(List<Integer> regNos);
     public    String  deleteAllPhoneNumbersOfaPerson(int pid);
     public   String  removeAllPhoneNumbersOfaPersonByPid(int pid);
     
     public   List<Object[]> getDataUsingPersonByJoins();
     
     public  List<Person>  getData1UsingPersonByJoins();
}
