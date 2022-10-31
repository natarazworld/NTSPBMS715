//Controller class
package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
	
	@GetMapping("/")
	public   String showHome() {
		System.out.println("CustomerOperationsController.showHome()");
		//return LVN
		return "home";
		
	}
	
	@GetMapping("/customer_register")
	public  String  ShowCustomerFormPage(@ModelAttribute("cust") Customer cust) {
		System.out.println("CustomerOperationsController.ShowCustomerFormPage()");
		//return LVN
		 return "show_customer_form";
		
	}
	
	@PostMapping("/customer_register")
	public String   customerFormPageSumbission(@ModelAttribute("cust") Customer cust, 
			                                                                                Map<String,Object> map) {
		System.out.println("CustomerOperationsController.customerFormPageSumbission()");
		map.put("custData", cust);
		
		//return LVN
		return "show_result";
		
	}//method
	
	@InitBinder
	public  void  MyBinder(ServletRequestDataBinder binder) {
		System.out.println("CustomerOperationsController.MyBinder()");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf,true));
		
	}

	
}//class
