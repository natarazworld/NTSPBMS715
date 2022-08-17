
package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PersonInfo {
	@Id
	@GeneratedValue
	public  Integer pid;
	@Column(length = 20)
	private String pname;
	private  Float page;
	// java8  date and time api
	private  LocalDate DOB;
	private  LocalTime TOB;
    private  LocalDateTime DOJ;
    //getters & setters
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
	public Float getPage() {
		return page;
	}
	public void setPage(Float page) {
		this.page = page;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public LocalTime getTOB() {
		return TOB;
	}
	public void setTOB(LocalTime tOB) {
		TOB = tOB;
	}
	public LocalDateTime getDOJ() {
		return DOJ;
	}
	public void setDOJ(LocalDateTime dOJ) {
		DOJ = dOJ;
	}
    //toString
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", page=" + page + ", DOB=" + DOB + ", TOB=" + TOB
				+ ", DOJ=" + DOJ + "]";
	}
	
	

}
