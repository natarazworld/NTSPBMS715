//Dependent class3
package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fFlight")
//@Primary
public final class FirstFlight implements Courier{   // rule3 ,rule2
	
	public FirstFlight() {
		System.out.println("FirstFligh:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ "order id oder is assinged to FirstFlight for Delivery";
	}

}
