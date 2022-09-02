//EmployeeMgmtServiceImpl.java
package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo  empRepo;

	@Override
	public List<Employee> searchEmployeeBySalaryRange(double start, double end) {
	     List<Employee> list=empRepo.findBySalaryBetween(start, end);
	     return list;
		
	}

	@Override
	public Employee searchEmployeeByEmail(String mail) {
		
		return empRepo.findByEmail(mail);
	}

	
	
	
	
}//class
