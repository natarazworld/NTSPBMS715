//PhoneNumber.java (Child class)
package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PHONE_NUMBERS_OTM")
@Setter
@Getter
public class PhoneNumber {
	@Id
	@GeneratedValue
   private  Integer regno;
	private  Long phone_number;
	@Column(length = 20)
	private  String number_type;
	@Column(length = 20)
	private  String  provider;
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="PERSON_ID",referencedColumnName = "PID")
	private   Person   person;
	
	public PhoneNumber() {
		System.out.println("PhoneNumber:: 0-param constructor ::"+this.getClass());
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	//setters && getters
	public Integer getRegno() {
		return regno;
	}
	public void setRegno(Integer regno) {
		this.regno = regno;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	public String getNumber_type() {
		return number_type;
	}
	public void setNumber_type(String number_type) {
		this.number_type = number_type;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", phone_number=" + phone_number + ", number_type=" + number_type
				+ ", provider=" + provider + "]";
	}
	
	
	
}
