//Actor.java (Entity class)
package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="DATA_JPA_ACTOR")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
//@DynamicInsert(true)
public class Actor {
	@Column(name="ACTOR_ID")
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)  //generator cfg
	private Integer aid;
	
	@Column(name="ACTOR_NAME",length = 20)
	@NonNull
	private String  aname;

	@Column(name="CATEGORY",length = 20)
	@NonNull
	private  String category;
	
	@Column(name="MOBILE_NUMBER")
	@NonNull
	private  Long mobileNo;
	
	@Column(name="STATUS",length = 1)
	@NonNull
	private Boolean status;
	public  Actor() {
		System.out.println("Actor: 0-param constructor"+this.getClass());
	}

}
