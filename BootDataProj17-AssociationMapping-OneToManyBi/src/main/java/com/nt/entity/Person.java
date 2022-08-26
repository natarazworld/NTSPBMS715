//Person.java (parent class)
package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PERSON_OTM")
@Setter
@Getter
public class Person  implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1",initialValue = 1000,allocationSize = 5,sequenceName = "PID_SEQ")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length = 20)
	private String  pname;
	@Column(length = 20)
	private  String  paddrs;
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,
			                        mappedBy = "person",orphanRemoval = true)
		private  Set<PhoneNumber> phones;
	
	
	public Person() {
		System.out.println("Person :: 0-param constructor::"+this.getClass());
	}
	
		//setters &&  getters
	
	
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

	public Set<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}

	//toString
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}

}
