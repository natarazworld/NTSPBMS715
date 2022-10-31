//Employee.java
package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name="BOOT_EMP")
@Data
@SQLDelete(sql="UPDATE BOOT_EMP SET STATUS='INACTIVE' WHERE EMPNO=?")   // query for soft deletion
@Where(clause = "STATUS <> 'INACTIVE' ")  // implicit condition on CURD Operation to avoid  softely deleted records
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
	private   Integer deptno=40;
	private  String status="ACTIVE";
	@Transient
	private   String  vflag="no";
	
	public String getVflag() {
		return vflag;
	}
	public void setVflag(String vflag) {
		this.vflag = vflag;
	}
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
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ "]";
	}
	

}
