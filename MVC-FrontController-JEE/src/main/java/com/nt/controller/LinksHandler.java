//LinksHandler.java
package com.nt.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.nt.serivce.ILinksService;
import com.nt.serivce.LinksServiceImpl;

public class LinksHandler {
	private ILinksService service;
	
	public LinksHandler() {
		 service=new LinksServiceImpl();
	}
	
	//Handler method1
	public  String showWishMssage(HttpServletRequest req) {
		//use service
		String  resultMsg=service.generateWishMessage();
		// keep result in reqiuest scope
		req.setAttribute("wmsg",resultMsg);
		//return Logical View name (LVN) based which physical
		//Jps file name and locaton will be decided
		return  "wish_result";
	}
	
	public  String  showAllLanguages(HttpServletRequest req) {
		//use serivce
		 Set<String>  langSet=service.fetchAllLanguages();
		 //keep results in request scope
		 req.setAttribute("langInfo", langSet);
		 //return LVN
		 return "all_lang";
		 
	}
	
	
	

}
