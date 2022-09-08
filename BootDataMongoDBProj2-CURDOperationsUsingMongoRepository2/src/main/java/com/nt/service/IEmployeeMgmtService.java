//IEmployeeMgmtService.java
package com.nt.service;

import java.util.Optional;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
   public  String  registerEmployee(Employee e);
   public  Optional<Employee> showEmployeeById(int id);
  
}
