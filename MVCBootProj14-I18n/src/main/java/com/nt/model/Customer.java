//Customer.java
package com.nt.model;

import lombok.Data;

@Data
public class Customer {
	private  Integer cno;
	private  String cname;
	private  String  caddrs;
	private  Double  billAmount;
	
	
	//setters & getters
	
	
	
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


	public String getCaddrs() {
		return caddrs;
	}


	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}


	public Double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}


	//toString()
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", caddrs=" + caddrs + ", billAmount=" + billAmount + "]";
	}
}
