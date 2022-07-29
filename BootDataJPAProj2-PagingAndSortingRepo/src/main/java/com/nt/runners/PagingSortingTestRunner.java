//PagingSortingTestRunner.java
package com.nt.runners;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class PagingSortingTestRunner implements CommandLineRunner {
	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
	 
		/*  //   --------------- findAll(Sort sort) call ---------------------------
		service.showActorsByOrder(false,"aname").forEach(System.out::println);
		  //   --------------- findAll(Sort sort) call ---------------------------
		service.showActorsByOrder(true,"aname","aid").forEach(System.out::println);
		*/
		/*	 //   --------------- findAll(Pageable<T> pageable) call ---------------------------
			Page<Actor>  page=service.showPageRecords(0, 3);
			List<Actor> list=page.getContent();
			System.out.println("records are ::");
			list.forEach(System.out::println);
			System.out.println("other info about page");
			System.out.println("current page no:"+page.getNumber());
			System.out.println(" total pages ::"+page.getTotalPages());
			System.out.println("total records ::"+page.getTotalElements());
			System.out.println("Is it first page ::"+page.isFirst());
			System.out.println("Is it Last page ::"+page.isLast());
		*/
		
		 //   --------------- findAll(Pageable<T> pageable) call ---------------------------
		service.showActorsByPage(3);

	}//run
}//class
