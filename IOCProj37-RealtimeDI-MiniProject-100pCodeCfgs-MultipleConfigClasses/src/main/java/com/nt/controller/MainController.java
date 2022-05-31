package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

@Controller("controller")
public final class MainController {
	// HAS -A property
	@Autowired
	private  ICustomerMgmtService  service;
	
	
	
	public String   processCustomer(CustomerVO vo)throws Exception {
		 //convert VO class obj to DTO class obj
		 CustomerDTO custDTO=new CustomerDTO();
		 custDTO.setCname(vo.getCname());
		 custDTO.setCadd(vo.getCadd());
		 custDTO.setPamt(Double.parseDouble(vo.getPamt()));
		 custDTO.setTime(Double.parseDouble(vo.getTime()));
		 custDTO.setRate(Double.parseDouble(vo.getRate()));
		  //use SErvice
		 String resultMsg=service.registerCustomer(custDTO);
		 return resultMsg;
		
	}
	

}
