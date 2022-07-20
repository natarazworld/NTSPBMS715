package com.nt.core;

public class FI_LAMDATest {

	public static void main(String[] args) {
		 Arithemetic ar=(int a,int b)->{
			                         int c=0;
			                         c=a+b;
			                         return c;
		                       };
		 System.out.println(ar.add(10, 20));
	 System.out.println("-------------------------------");
     Arithemetic ar1=(int a,int b)->{
    	    return a+b;
     };
     System.out.println(ar1.add(10, 20));
     System.out.println("-------------------------");
     
     Arithemetic ar2=(int a,int b)->   a+b;
     
     System.out.println(ar2.add(10, 20));
     System.out.println("-------------------------");

     Arithemetic ar3=( a, b)->   a+b;
     System.out.println(ar3.add(10, 20));
     System.out.println("-------------------------");

     Arithemetic ar4=(x, y)->   x+y;
     System.out.println(ar4.add(10, 20));
     System.out.println("-------------------------");

		 
	}

}
