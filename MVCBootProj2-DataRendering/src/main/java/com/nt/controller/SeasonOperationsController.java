//SeasonOperationsController.java
package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
@RequestMapping("/seasons")
public class SeasonOperationsController {
	@Autowired
	private  ISeasonFinderService  service;

	// @RequestMapping("/")
	 @GetMapping
	public  String showHome() {
		 System.out.println("SeasonOperationsController.showHome()");
	   return  "welcome";	
	}
	 

	
	 
	 @RequestMapping("/season")
	 public String  showSeason(Map<String,Object> map) {
		 //use service
		 String msg=service.findSeason();
		 //keep  results in Model Attribute
		 map.put("resultMsg", msg);
		 //return  LVN
		 return "display";
	 }
	 
	 //@RequestMapping(value="/report",method=RequestMethod.GET)
	 @GetMapping("/report")
	 public   String showReport1() {
		 System.out.println("SeasonOperationsController.showReport1()");
		 return "display_report";
	 }
	 
		/*//@RequestMapping(value="/report",method=RequestMethod.POST)
		@GetMapping("/report")
		 public   String showReport2() {
			 System.out.println("SeasonOperationsController.showReport2()");
			 return "display_report1";
		 }*/
	 
	 @GetMapping("/all")
	   public   String   showAll() {
		 System.out.println("SeasonOperationsController.showAll()");
		   return "display";
	   }

}
