package com.nt.beans;

public class A {
	private  B b;
	
	public A(B  b) {
		this.b=b;
		System.out.println("A: 1-param consstructor");
	}
	
	/*public void setB(B b) {
		System.out.println("A.setB()");
		this.b=b;
	}*/

	@Override
	public String toString() {
		return "A [b=";
	}

}
