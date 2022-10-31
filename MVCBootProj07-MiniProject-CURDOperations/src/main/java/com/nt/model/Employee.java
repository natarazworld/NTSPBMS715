//Employee.java
package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMP")
@Data
public class Employee implements Serializable   {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "emp_id_seq",initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1")
	private  Integer empno;
	@Column(length = 20)
	private  String  ename;
	@Column(length = 20)
	private   String  job="CLERK";
	private  Double sal;
	private   Integer deptno;
	
	//setters && getters
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ "]";
	}
	

}
