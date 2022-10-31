// JobSeekerInfo.java
package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="BOOT_JS_INFO")
@Entity
public class JobSeekerInfo implements Serializable {
	@Id
	@Column(name="JS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer jsId;
	@Column(name="JS_NAME",length = 30)
	private  String jsName;
	@Column(name="JS_ADDRS",length = 30)
	private  String jsAddrs;
	@Column(name="JS_RESUME_PATH",length = 100)
	private  String resumePath;
	@Column(name="JS_PHOTO_PATH",length = 100)
	private  String photoPath;
	
	
	//setters && getters
	public Integer getJsId() {
		return jsId;
	}


	public void setJsId(Integer jsId) {
		this.jsId = jsId;
	}


	public String getJsName() {
		return jsName;
	}


	public void setJsName(String jsName) {
		this.jsName = jsName;
	}


	public String getJsAddrs() {
		return jsAddrs;
	}


	public void setJsAddrs(String jsAddrs) {
		this.jsAddrs = jsAddrs;
	}


	public String getResumePath() {
		return resumePath;
	}


	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}


	public String getPhotoPath() {
		return photoPath;
	}


	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "JobSeekerInfo [jsId=" + jsId + ", jsName=" + jsName + ", jsAddrs=" + jsAddrs + ", resumePath="
				+ resumePath + ", photoPath=" + photoPath + "]";
	}


	
}
