//Account.java
package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATA_JPA_ACCOUNT")
public class Account {
	@Id
	private Long acno;
	private String holdername;
	private Double amount;

	// setters && getters (alt+shift+s,r)
	public Long getAcno() {
		return acno;
	}

	public void setAcno(Long acno) {
		this.acno = acno;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
