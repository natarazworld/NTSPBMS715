//Dependent class4
package com.nt.sbeans;

public final class DHL implements Courier{   // rule3 ,rule2
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ "order id oder is assinged to DHL for Delivery";
	}

}
