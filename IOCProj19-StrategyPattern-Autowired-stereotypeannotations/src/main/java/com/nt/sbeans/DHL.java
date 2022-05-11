//Dependent class4
package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
//@Lazy(true)
@Primary
@Scope("prototype")
public final class DHL implements Courier{   // rule3 ,rule2
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ "order id oder is assinged to DHL for Delivery";
	}

}
