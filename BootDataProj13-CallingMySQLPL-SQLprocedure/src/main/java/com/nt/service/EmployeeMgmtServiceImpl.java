//EmployeeMgmtServiceImpl.java
package com.nt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> fetchEmpsByDesgs(String desg1, String desg2) {
		//create StoredProcedureQuery object pointing to PL/SQL procedure
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_EMP_DETAILS_BY_DESG",Employee.class);
		//register  PARAMS
		query.registerStoredProcedureParameter(1,String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class,ParameterMode.IN);
		//set values to  IN parms
		query.setParameter(1, desg1);
		query.setParameter(2, desg2);
		//call PL/SQL Procedure
		List<Employee> list=query.getResultList();
			
		return list;
	}

}
