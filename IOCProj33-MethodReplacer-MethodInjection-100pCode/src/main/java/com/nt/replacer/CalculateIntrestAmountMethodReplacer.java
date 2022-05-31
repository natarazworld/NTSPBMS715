//CalculateIntrestAmountMethodReplacer.java
package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("ciaReplacer")
public class CalculateIntrestAmountMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalculateIntrestAmountMethodReplacer.reimplement(-,-,-)(simple Intrest amount)");
		double pamt=(double)args[0];
		double rate=(double)args[1];
		double time=(double)args[2];
		//calculate  simple Intrest amount
		double intramount=pamt*rate*time/100.0f;
		return intramount;
	}

}
