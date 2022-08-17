//EmployeeInfo.java
package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE_INFO_TAB")
@Data
public class EmployeeInfo {
	@Id
	@GeneratedValue
	private  Integer eno;
	@Column(length = 20)
	private String ename;
	@ElementCollection   //Enables the colletion mapping
	@CollectionTable(name = "EMPLOYEE_FRIENDS",
	                joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))  //To specify child table and  fk column
	@Column(name="FRIEND_NAME",length = 20)  //To store list elements
	@OrderColumn(name = "FRIEND_INDX")  //To store List element indexes
	@ListIndexBase(1)
    private List<String> friends;
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_PHONES",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))
	@Column(name="PHONE_NUMBER")   // To store Set Elements
	private Set<Long> phones;
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_IDDETAILS",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))
	@Column(name="ID_NUMBER")   // To store map element values
	@MapKeyColumn(name = "ID_TYPE",length = 20) // To store map element keys
	private Map<String,Long> idDetails;
	 // generate setters && getters
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String, Long> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Long> idDetails) {
		this.idDetails = idDetails;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "EmployeeInfo [eno=" + eno + ", ename=" + ename + ", friends=" + friends + ", phones=" + phones
				+ ", idDetails=" + idDetails + "]";
	}
}
