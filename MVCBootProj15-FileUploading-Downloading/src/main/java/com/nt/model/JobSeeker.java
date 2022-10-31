//JobSeekeer.java
package com.nt.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class JobSeeker {
    private  String jsName;
    private  String jsAddrs;
    private  MultipartFile  resume;
    private   MultipartFile  photo;
    //setters  && getters
	public String getJsName() {
		return jsName;
	}
	public void setJsName(String jsName) {
		this.jsName = jsName;
	}
	public String getJsAddrs() {
		return jsAddrs;
	}
	public void setJsAddrs(String jsAddrs) {
		this.jsAddrs = jsAddrs;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	
     
	//toString
	
	@Override
	public String toString() {
		return "JobSeeker [jsName=" + jsName + ", jsAddrs=" + jsAddrs + ", resume=" + resume + ", photo=" + photo + "]";
	}
	
    
}
