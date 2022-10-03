package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {

	@GetMapping("/")  //To show Home Page
	public String  showHome() {
	  //return  LVN
		  return "welcome";
	}
	
	@GetMapping("/register")  //To launch form page
	public String  showForm() {
		//return LVN
		return "student_register";
	}
	
	@PostMapping("/register")
	public   String  processStudent(Map<String,Object> map,
			                                                       @ModelAttribute("stud") Student st) {
		// generate result
		 String grade=null;
		  if(st.getAvg()>=75)
			  grade="First Class with Dist";
		  else if(st.getAvg()>=60)
			   grade="First class";
		  else if(st.getAvg()>=50)
			   grade="Scond class";
		  else if(st.getAvg()>=35)
			   grade="Third class";
		  else
			  grade="Fail";
		  //keep results in Model attribute
		   map.put("result",grade);
		   //return  LVN
		   return "show_result";
		  
		
	}
}
