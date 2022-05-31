package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private Integer  cno;
	private String  cname;
	private  String cadd;
	private  Double  pamt;
	private  Double  rate;
	private  Double time;
	//setter and getters  (alt+shift+s,r)
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
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Double getPamt() {
		return pamt;
	}
	public void setPamt(Double pamt) {
		this.pamt = pamt;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getTime() {
		return time;
	}
	public void setTime(Double time) {
		this.time = time;
	}
	

}
