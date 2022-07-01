//EmployeeMgmtService.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeDAO   empDAO;
	
	public EmployeeMgmtService() {
		System.out.println("EmployeeMgmtService: 0-param constructor");
	}

	@Override
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeMgmtService.fetchEmployeesByDesgs()");
		  //use   DAO
		List<Employee> list=empDAO.getEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
