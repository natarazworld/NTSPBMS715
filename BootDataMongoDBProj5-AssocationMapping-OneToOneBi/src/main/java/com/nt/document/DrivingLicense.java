//DrivingLicense.java
package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "LICENSE_OTO")
@Setter
@Getter
public class DrivingLicense {
	@Id
   private  Integer  lno;
	private  String  licenseType;
	private  LocalDateTime  expiryDate;
	private  Person  personDetails;
	  //setters && getters  (alt+shift+s,r)
	public Integer getLno() {
		return lno;
	}
	public void setLno(Integer lno) {
		this.lno = lno;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Person getPersonDetails() {
		return personDetails;
	}
	public void setPersonDetails(Person personDetails) {
		this.personDetails = personDetails;
	}
	//toStirng  (alt+shift+s, s)
	@Override
	public String toString() {
		return "DrivingLicense [lno=" + lno + ", licenseType=" + licenseType + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
