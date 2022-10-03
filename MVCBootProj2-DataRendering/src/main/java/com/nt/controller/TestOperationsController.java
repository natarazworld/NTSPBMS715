package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestOperationsController {

	@GetMapping("/all")
	public   String  showTestData() {
		System.out.println("TestOperationsController.showTestData()");
		return "display";
	}
}
