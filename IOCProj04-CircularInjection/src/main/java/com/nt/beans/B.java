package com.nt.beans;

public class B {
	private   A  a;
	
	public B(A  a) {
		this.a=a;
		System.out.println("B: 1-param constructor");
	}
	
	/*public void  setA(A a) {
		System.out.println("B.setA()");
		this.a=a;
	}*/

	@Override
	public String toString() {
		return "B [a=";
	}
	

}
