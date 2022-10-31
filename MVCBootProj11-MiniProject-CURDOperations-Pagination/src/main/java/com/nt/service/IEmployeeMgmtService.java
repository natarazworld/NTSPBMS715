//Service Interface
package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
       public Iterable<Employee>  getAllEmployees();
       public   String    registerEmployee(Employee emp);
       public   Employee   getEmployeeByNo(int  eno);
       public   String   updateEmployee(Employee emp);
       public   String    deleteEmployeeById(int eno);
       public    List<Integer>  fetchAllDeptno();
       public  boolean   IsDesgInRejectedList(String desg);
       public  Page<Employee>  getEmployeesReportDataByPage(Pageable pageable);
}
