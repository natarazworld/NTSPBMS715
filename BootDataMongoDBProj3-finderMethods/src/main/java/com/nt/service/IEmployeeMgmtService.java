//IEmployeeMgmtService.java
package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
   public   List<Employee>  searchEmployeeBySalaryRange(double start, double end);
  public   Employee   searchEmployeeByEmail(String mail);
}
