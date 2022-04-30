//Dependent class1
package com.nt.comps;

public final class DTDC implements Courier{   // rule3 ,rule2
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ "order id oder is assinged to  DTDC for Delivery";
	}

}
