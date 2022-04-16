package com.nt.test;

public class Test {
	private int  a;
	private int b;
	
	
	
	private Test() {
			System.out.println("Test:: 0-param construtor(private)");
			}



	// alt+shift +s, o
	 private Test(int a, int b) {
      System.out.println("Test: 2 -param constructor(private)");
		this.a = a;
		this.b = b;
	}

	  


	// alt +shift +s ,s
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}//class
