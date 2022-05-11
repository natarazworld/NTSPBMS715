package com.nt.bo;

public class CustomerBO {
	private Integer cno;
	private String cname;
	private  String cadd;
	private  Double   pamt;
	private  Double  intramt;
	
	//setter && getters  (alt+shift+s, r)
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
	public Double getIntramt() {
		return intramt;
	}
	public void setIntramt(Double intramt) {
		this.intramt = intramt;
	}
	

}
