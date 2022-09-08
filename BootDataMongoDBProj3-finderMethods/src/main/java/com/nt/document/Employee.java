//Employee.java
package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Employee_Info")
@Data
public class Employee {
	@Id
	private  Integer eno;
	private  String ename;
	private   String eadd;
	private  Double salary;
	private  String email;
	
	 //setters & gettters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Boolean isVaccinated;
	
	
	
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
		return "Employee [ eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", salary=" + salary
				+ ", isVaccinated=" + isVaccinated + ",email="+email+"]";
	}
	
	
	

}
