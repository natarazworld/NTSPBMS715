//Model class
package com.nt.model;

import java.util.Date;

public class Customer {
	private  Integer cno;
	private  String cname;
	private   Date  dob;
	private   Date  dop=new Date();
	private  Boolean  isHavingMembership=false;
	//setters && getters
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	public Boolean getIsHavingMembership() {
		return isHavingMembership;
	}
	public void setIsHavingMembership(Boolean isHavingMembership) {
		this.isHavingMembership = isHavingMembership;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", dob=" + dob + ", dop=" + dop + ", isHavingMembership="
				+ isHavingMembership + "]";
	}
	

}
