package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class DataRenderingOpeationsController {
	
	/*@GetMapping("/report")
	public  String   sendData(Map<String,Object> map) {
		 // put simple values to Model attributes
		map.put("name", "raja");
		map.put("age", 30);
		//return LVN
		return "show_report";
		
	}*/
	
	/*	@GetMapping("/report")
		public  String   sendData(Map<String,Object> map) {
			 // put arrays,collections as the model attribute values
			 map.put("favColors", new String[] {"red","green","yellow"});
			 map.put("nickNames", List.of("raja","raj","maharaj"));
			 map.put("phoneNumbers",Set.of(999999L,888888L,7777777L));
			 map.put("idDetails",Map.of("aadharNo",7889999,"voterId",654665464));
		
			//return LVN
			return "show_report";
			
		}*/
	
	
	/*@GetMapping("/report")
	public  String   sendData(Map<String,Object> map) {
		  //create Model class object with data  
		 Employee emp=new Employee();
		   emp.setEno(1001); emp.setEname("raja");
		   emp.setSalary(90000.0); emp.setVaccinated(true);
		  //add Model class object to Model attribute
		   map.put("empInfo",emp);
		   //return LVN
		   return "show_report";
		   
	}*/
	
	
	@GetMapping("/report")
	public  String   sendData(Map<String,Object> map) {
		  //create Colelction of  Model class objects
		    List<Employee>  empsList=List.of(new Employee(1001,"raja",90000.0,true),
		    		                                                          new Employee(1002,"rajesh",80000.0,true),
		    		                                                          new Employee(1003,"mahesh",90000.0,true));
		
		  //add Collecton of Model class object to Model attribute
		   map.put("empsListInfo",empsList);
		   //return LVN
		   return "show_report";
		   
	}

}
