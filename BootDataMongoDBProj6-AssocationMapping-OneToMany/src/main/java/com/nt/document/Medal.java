//Child class2
package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "MEDAL_DETAILS")
@Setter
@Getter
public class Medal {
	@Id
	private  Integer mid;

	private  String medalType;
	private  String eventName;
	private   LocalDateTime  medalDate;
	
	public Medal() {
		System.out.println("Medal: 0-param constructor");
	}
	
	
	
	public Medal(Integer mid, String medalType, String eventName, LocalDateTime medalDate) {
	     System.out.println("Medal:4-param constructor");
		this.mid = mid;
		this.medalType = medalType;
		this.eventName = eventName;
		this.medalDate = medalDate;
	}



	//setters & getters
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMedalType() {
		return medalType;
	}
	public void setMedalType(String medalType) {
		this.medalType = medalType;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public LocalDateTime getMedalDate() {
		return medalDate;
	}
	public void setMedalDate(LocalDateTime medalDate) {
		this.medalDate = medalDate;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Medal [mid=" + mid + ", medalType=" + medalType + ", eventName=" + eventName + ", medalDate="
				+ medalDate + "]";
	}
	

}
