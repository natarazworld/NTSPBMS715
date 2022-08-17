// PersonInfo.java
package com.nt.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="PERSON_INFO_LOBS")
@Data
public class PersonInfo {
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length = 20)
	private String pname;
	private LocalDateTime dob;
	private Boolean married;
	@Lob
	private  byte[]  photo;  //for BLOB files
	@Lob
	private  char[]  resume;   //for CLOB files
	
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
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public Boolean getMarried() {
		return married;
	}
	public void setMarried(Boolean married) {
		this.married = married;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public char[] getResume() {
		return resume;
	}
	public void setResume(char[] resume) {
		this.resume = resume;
	}
	
	
	//toString()
 
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", dob=" + dob + ", married=" + married + ", photo="
				+ Arrays.toString(photo) + ", resume=" + Arrays.toString(resume) + "]";
	}
	
	

}
