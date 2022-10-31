//Service Impl class
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IDepartmentRepository;
import com.nt.repository.IEmployeeRepository;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private   IEmployeeRepository   empRepo;

	@Override
	public Iterable<Employee> getAllEmployees() {
		Iterable<Employee> itEmps=empRepo.findAll();
		System.out.println(itEmps);
		return itEmps;
	}
	
	@Override
	public String registerEmployee(Employee emp) {
		
		return  "employee is saved with id value:"+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int eno) {
		 Employee emp=empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
		 return emp;
	}
	
	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is Updated with having id value ::"+empRepo.save(emp).getEmpno();
	}
	
	
	@Override
	public String deleteEmployeeById(int eno) {
		
		 empRepo.deleteById(eno);
		 
		 return  eno+"  employee id  Employee is deleted";
		
	}
    
	   @Autowired
	  private  IDepartmentRepository  deptRepo;
	   
	@Override
	public List<Integer> fetchAllDeptno() {
		//use repository
		List<Integer> deptnoList=deptRepo.getAllDeptNo();
		return deptnoList;
	}
	

}
