package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonMgmtService;

@Component
public class DateTimeTestRunner implements CommandLineRunner {
	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
	/*	PersonInfo person=new PersonInfo();
		person.setPname("ramesh"); person.setPage(40.0f);
		person.setDOB(LocalDate.of(1991, 10, 20));
		person.setTOB(LocalTime.of(5,20,30, 100));
		person.setDOJ(LocalDateTime.of(2016, 9, 21, 16, 20, 4));
		
		System.out.println(service.registerPerson(person)); */
		
		System.out.println("____________________");
		service.fetchAllPerson().forEach(System.out::println);
		
		

	}

}
