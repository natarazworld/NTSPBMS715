//Dependent class2
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements Courier {  //rule3 ,rule2
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ "order id oder  is assinged to  BlueDart for Delivery";
	}

}
