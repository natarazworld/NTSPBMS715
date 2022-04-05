package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private String sadd;
	private  double avg;
	private  String course;

	public Student(int sno, String sname, String sadd) {
	System.out.println("Student:: 3-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + ", course=" + course
				+ "]";
	}

}//class
