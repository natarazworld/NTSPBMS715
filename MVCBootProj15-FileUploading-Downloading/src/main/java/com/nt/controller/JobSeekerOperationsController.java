//JobSeekerOperationsController.java
package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.JobSeekerInfo;
import com.nt.model.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Controller
public class JobSeekerOperationsController {
	 @Autowired
	private  IJobSeekerMgmtService jsService;
	 
	 @GetMapping("/")
	 public  String showHomePage() {
		//return  LVN
		 return  "welcome";
	 }
	 
	 @GetMapping("/js_register")
	 public  String    showRegisterJsFormPage(@ModelAttribute("js") JobSeeker js) {
		//return  LVN
		 return "jobseeker_register";
	 }
	 
	 @Autowired
	 private Environment  env;
	 
	 @PostMapping("/js_register")
	 public  String registerJsDetails(@ModelAttribute("js") JobSeeker js,
			                                                           Map<String,Object> map)throws Exception {
		  String uploadPath=env.getProperty("upload.path");
		  
		  //create  upload files store folder on the server machine file Sytem if it is not already avaiable
		   File storeFolder=new File(uploadPath);
		   if(!storeFolder.exists())
			     storeFolder.mkdir();
		  
		  
		  // get MultiPartFile objects representing the uploaded files from  Model class obj
		  MultipartFile  file1=js.getResume();
		  MultipartFile  file2=js.getPhoto();
		  //get the InputStream objs pointing to uploaded files content
		  InputStream  is1=file1.getInputStream();
		  InputStream  is2=file2.getInputStream();
		  //get the names of the uploaded files
		  String  filename1=file1.getOriginalFilename();
		  String  filename2=file2.getOriginalFilename();
		  System.out.println(filename1+"   "+filename2);
		  //create OutputStreams pointing the dest files on server machine file System
		  OutputStream  os1=new FileOutputStream(uploadPath+"/"+filename1);
		  OutputStream  os2=new FileOutputStream(uploadPath+"/"+filename2);
		  //  copy  uploded file content to  (is1,is2) to  empty destination file on sever machine file system
		   //        Librrary ::  Commons-io-<ver>.jar
		      //IOUtils.copy(is1, os1);
		      //IOUtils.copy(is2, os2);
		  //alternate code from java9
		     is1.transferTo(os1);
		     is2.transferTo(os2);
		     
		     //close the strems
		     is1.close(); is2.close();
		     os1.close(); os2.close();
		  
		  //  create Entity class obj by collecting data from  Model class obj
		      JobSeekerInfo  info=new JobSeekerInfo();
		      info.setJsName(js.getJsName());
		      info.setJsAddrs(js.getJsAddrs());
		      info.setPhotoPath(uploadPath+"/"+filename1);
		      info.setResumePath(uploadPath+"/"+filename2);
		      //use service
		      String msg=jsService.registerJobSeeker(info);
		      
		 //add the   names of the uploaded files  to Model Attributes
		      map.put("fileName1", filename1);
		      map.put("fileName2", filename2);
		      map.put("resultMsg", msg);
		      //return LVN
		  return "show_result";
	 }//method
	 
	 

}//class
