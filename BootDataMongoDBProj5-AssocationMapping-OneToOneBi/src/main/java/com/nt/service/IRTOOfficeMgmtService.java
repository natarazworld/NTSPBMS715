//IRTOOfficeMgmtService.java
package com.nt.service;

import java.util.List;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;

public interface IRTOOfficeMgmtService {
    public  String saveDataUsingPerson(Person pers);
    public  String  saveDataUsingDrivingLicense(DrivingLicense license);
    public  List<Person> showDataUsingPerson();
    public  List<DrivingLicense> showDataUsingDrivingLicense();
}
