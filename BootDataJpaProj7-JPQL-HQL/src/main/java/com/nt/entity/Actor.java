//Actor.java (Entity class)
package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Actor {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)  //generator cfg
	private Integer aid;
	
	//@NonNull
	@Column(length = 20)
	private String  aname;

	//@NonNull
	@Column(length = 20)
	private  String category;
	
	//@NonNull
	@Column(unique = true,nullable = true)
	private  Long mobileNo;
	
	public  Actor() {
		System.out.println("Actor: 0-param constructor"+this.getClass());
	}
	
	

	public Actor(Integer aid, String aname, String category, Long mobileNo) {
		
		this.aid = aid;
		this.aname = aname;
		this.category = category;
		this.mobileNo = mobileNo;
	}



	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + ", category=" + category + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
