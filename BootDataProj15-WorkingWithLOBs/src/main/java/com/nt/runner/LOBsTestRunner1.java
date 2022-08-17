package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonInfoMgmtService;

@Component
public class LOBsTestRunner1 implements CommandLineRunner {
	@Autowired
	private IPersonInfoMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
	   //invoke method
		 PersonInfo info=service.getPersonByPid(3);
		 System.out.println(info.getPid()+" "+info.getPname()+" "+info.getMarried()+ " "+info.getDob());
		 byte[] photoContent=info.getPhoto();
		 char[] resumeContent=info.getResume();
		 //create new File writing photo context
		 FileOutputStream fos=new FileOutputStream("new_photo.jpg");
		 fos.write(photoContent);
		 fos.close();
		//create new File writing resume content
		 FileWriter writer=new FileWriter("new_resume.txt");
		 writer.write(resumeContent);
		 writer.close();
		 System.out.println("Files retrieved and saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
