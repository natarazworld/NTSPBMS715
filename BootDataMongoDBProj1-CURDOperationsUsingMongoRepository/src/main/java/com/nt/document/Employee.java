//Employee.java
package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Employee")
@Data
public class Employee {
	@Id
	private String id;
	private  Integer eno;
	private  String ename;
	private   String eadd;
	private  Double salary;
	private Boolean isVaccinated;
	 //setters & gettters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Boolean getIsVaccinated() {
		return isVaccinated;
	}
	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", salary=" + salary
				+ ", isVaccinated=" + isVaccinated + "]";
	}
	
	
	

}
