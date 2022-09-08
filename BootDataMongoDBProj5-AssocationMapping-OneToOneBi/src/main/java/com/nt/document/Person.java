//Person.java ( Parent class)
package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "PERSON_OTO")
@Setter
@Getter
public class Person {
	@Id
	private  Integer pid;
	private  String pname;
	private  String addrs;
    private  DrivingLicense licenseDetails;
    //setters && getters
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public DrivingLicense getLicenseDetails() {
		return licenseDetails;
	}
	public void setLicenseDetails(DrivingLicense licenseDetails) {
		this.licenseDetails = licenseDetails;
	}
    //toString
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + "]";
	}
	
    

}
