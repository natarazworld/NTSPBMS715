//AltertServiceRunner.java
package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(20)
public class AltertServiceRunner implements CommandLineRunner,Ordered {
	
	public AltertServiceRunner() {
		System.out.println("AltertServiceRunner:: 0-param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
      System.out.println("AltertServiceRunner.run()");
      System.out.println("Cmd line args are ::");
          for(String arg:args) {
        	  System.out.println(arg);
          }
	}//run(..)

	@Override
	public int getOrder() {
		return 0;
	}

}//class
