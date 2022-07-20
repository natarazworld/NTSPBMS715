//SMSAlertServiceRunner.java
package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class SMSAlertServiceRunner implements ApplicationRunner {

	public SMSAlertServiceRunner() {
		System.out.println("SMSAlertServiceRunner:: 0-param constructor");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("SMSAlertServiceRunner.run()");
		System.out.println("non-option args::"+args.getNonOptionArgs());
		System.out.println("option args-- keys::"+args.getOptionNames());
		System.out.println("option args--value::"+args.getOptionValues("key1"));
		System.out.println("all args -- values::"+Arrays.toString(args.getSourceArgs()));

	}

}
