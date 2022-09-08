package com.nt.document;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document (collection="PLAYER_INFO")
@Data
public class PlayerInfo {
	@Id
	private Integer pid;
	private String pname;
	private  String paddrs;
	private  List<String> nickNames;
	private  Set<Long> contactNumbers;
	private  String []  friends;
	private  Map<String,String>  impKnocks;
	private  Properties idDetails;
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
	public String getPaddrs() {
		return paddrs;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public Set<Long> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(Set<Long> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	public String[] getFriends() {
		return friends;
	}
	public void setFriends(String[] friends) {
		this.friends = friends;
	}
	public Map<String, String> getImpKnocks() {
		return impKnocks;
	}
	public void setImpKnocks(Map<String, String> impKnocks) {
		this.impKnocks = impKnocks;
	}
	public Properties getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Properties idDetails) {
		this.idDetails = idDetails;
	}
	
	@Override
	public String toString() {
		return "PlayerInfo [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", nickNames=" + nickNames
				+ ", contactNumbers=" + contactNumbers + ", friends=" + Arrays.toString(friends) + ", impKnocks="
				+ impKnocks + ", idDetails=" + idDetails + "]";
	}
	
	

}
