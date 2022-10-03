//Employee.java
package com.nt.model;

import java.io.Serializable;


public class Employee implements  Serializable{


	private Integer eno;
	private String ename;
	private  Double salary;
	private  boolean vaccinated;

	public Employee() {
		System.out.println("Employee: 0-param constructor");
	}

	// alt+shift+s ,o
	public Employee(Integer eno, String ename, Double salary, boolean vaccinated) {
		System.out.println("Employee:4-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.vaccinated = vaccinated;
	}



	//setters & getters  (alt+shift+s, s)



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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	//toString ((alt+shift+s, s))
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", vaccinated=" + vaccinated + "]";
	}

}
