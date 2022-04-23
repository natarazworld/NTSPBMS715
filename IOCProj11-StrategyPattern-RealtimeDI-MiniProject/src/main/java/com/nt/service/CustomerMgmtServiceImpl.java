package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;


public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	  // HAS - A property
	private  ICustomerDAO  dao;
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl:: 1 -param constructor");
		this.dao = dao;
	}//constructor


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
