//Parent class
package com.nt.document;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "PLAYER_OTM")
@Setter
@Getter
public class Player {
	@Id
	private Integer pid;
	private  String pname;
	private  String country;
	private  LocalDateTime dob;
	
	//special property (HAS- A collection)
	private  Set<Sport> sportsInfo;
	private   Map<String,Medal>  medalsInfo;
	
	public Player() {
		System.out.println("Player :: 0-param constructor");
	}
	
	
	public Player(Integer pid, String pname, String country, LocalDateTime dob, Set<Sport> sportsInfo,
			Map<String, Medal> medalsInfo) {
		System.out.println("Player: 6-param constructor");
			this.pid = pid;
		this.pname = pname;
		this.country = country;
		this.dob = dob;
		this.sportsInfo = sportsInfo;
		this.medalsInfo = medalsInfo;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public Set<Sport> getSportsInfo() {
		return sportsInfo;
	}
	public void setSportsInfo(Set<Sport> sportsInfo) {
		this.sportsInfo = sportsInfo;
	}
	public Map<String, Medal> getMedalsInfo() {
		return medalsInfo;
	}
	public void setMedalsInfo(Map<String, Medal> medalsInfo) {
		this.medalsInfo = medalsInfo;
	}
	//toString()
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", country=" + country + ", dob=" + dob + "]";
	}
	

}
