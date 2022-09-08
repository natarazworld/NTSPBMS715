//Child class1
package com.nt.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "Sport_Details")
@Setter
@Getter
public class Sport {
	@Id
	private Integer sid;
	private  String  sname;
	private  String[] kitItems;
	private  String sportType;
	
	public Sport() {
		System.out.println("Sport: 0-param constructor");
	}
	
	
	public Sport(Integer sid, String sname, String[] kitItems, String sportType) {
	    System.out.println("Sport: 4-param cosntructor");
		this.sid = sid;
		this.sname = sname;
		this.kitItems = kitItems;
		this.sportType = sportType;
	}
	//setters & getters
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String[] getKitItems() {
		return kitItems;
	}
	public void setKitItems(String[] kitItems) {
		this.kitItems = kitItems;
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", kitItems=" + Arrays.toString(kitItems) + ", sportType="
				+ sportType + "]";
	}
	
	

}
