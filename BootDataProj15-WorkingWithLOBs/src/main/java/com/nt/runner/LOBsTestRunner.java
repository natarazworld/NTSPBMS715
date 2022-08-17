package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonInfoMgmtService;

//@Component
public class LOBsTestRunner implements CommandLineRunner {
	@Autowired
	private IPersonInfoMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		//read inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person name");
		String name=sc.next();
		System.out.println("Enter DOBT (yyyy-MM-ddThh:mm:ss)");
		String dob=sc.next();
		System.out.println("Is the Person Married?");
		boolean  ms=sc.nextBoolean();
		System.out.println("Enter Photo flle path::");
		String photoPath=sc.next().trim();
		System.out.println("Enter resume flle path::");
		String resumePath=sc.next().trim();
		
		//coverting String date values to  LocalDateTime class obj
		LocalDateTime ldt=LocalDateTime.parse(dob);
		// prepare byte[]  from the photo file content
		File file1=new File(photoPath);
		FileInputStream  fis=new FileInputStream(file1);
		byte[] photoContent=new byte[(int) file1.length()];
		fis.read(photoContent);
		// prepare char[]  from the resume file content
		File file2=new File(resumePath);
		FileReader reader=new FileReader(file2);
		char[] resumeContent=new char[(int) file2.length()];
		reader.read(resumeContent);
		
		//create Entity class obj
		PersonInfo info=new PersonInfo();
		info.setPname(name); info.setMarried(ms);
		info.setDob(ldt); info.setPhoto(photoContent);
		info.setResume(resumeContent);
		
		//save the object
		try {
			System.out.println(service.registerPerson(info));
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}//run(..)

}//class
