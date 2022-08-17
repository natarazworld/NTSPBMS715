package com.nt.service;

import com.nt.entity.PersonInfo;

public interface IPersonInfoMgmtService {
     public String  registerPerson(PersonInfo  info);
     public  PersonInfo  getPersonByPid(int pid);
}
