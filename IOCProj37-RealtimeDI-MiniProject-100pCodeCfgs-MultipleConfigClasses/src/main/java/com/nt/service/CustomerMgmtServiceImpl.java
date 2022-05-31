package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

@Service("custService")
public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	  // HAS - A property
	@Autowired
	@Qualifier("dao")
	private  ICustomerDAO  dao;
	
	
	


	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
		// write b.logic to calculate intrest amount
		double intramt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0;
		//prepare  CustomerBO class obj having persistable data
		CustomerBO custBO=new CustomerBO();
		custBO.setCname(dto.getCname());
		custBO.setCadd(dto.getCadd());
		custBO.setPamt(dto.getPamt());
		custBO.setIntramt(intramt);
		//use DAO
		int count= dao.insert(custBO);
		//process the result
		 return  count==0?" Registration failed":"Registration succedded:: Intrest amount::"+intramt;
	}//method

}//class
