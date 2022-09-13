package com.nt.model.offers;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="MDS_OFFERS")
public class Offers implements Serializable {
	

	@Id
	   @SequenceGenerator(name = "gen1",initialValue = 1000,allocationSize = 1,sequenceName = "oid_seq")
	   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
      private Integer oid;
	   @Column(length =50)
	   private  String offerName;
	   private  Double discount;
	   private  LocalDate validTo;
	   
	   public Offers() {
		
	}
	   
	   public Offers(String offerName, Double discount, LocalDate validTo) {
		
			this.offerName = offerName;
			this.discount = discount;
			this.validTo = validTo;
		}
	   
	   
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public LocalDate getValidTo() {
		return validTo;
	}
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	
	@Override
	public String toString() {
		return "Offers [oid=" + oid + ", offerName=" + offerName + ", discount=" + discount + ", validTo=" + validTo
				+ "]";
	}
	
	
}
