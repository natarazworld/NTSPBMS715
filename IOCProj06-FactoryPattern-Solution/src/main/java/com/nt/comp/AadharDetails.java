package com.nt.comp;

public class AadharDetails {
	private long aadharNo;
	private  int   age;
	private long mobileNo;
	
	
	
	public AadharDetails(long aadharNo, int age, long mobileNo) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}



	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
