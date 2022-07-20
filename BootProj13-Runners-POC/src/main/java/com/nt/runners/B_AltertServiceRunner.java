//AltertServiceRunner.java
package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class B_AltertServiceRunner implements CommandLineRunner {
	
	public B_AltertServiceRunner() {
		System.out.println("B_AltertServiceRunner:: 0-param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
      System.out.println("B_AltertServiceRunner.run()");
      System.out.println("Cmd line args are ::");
          for(String arg:args) {
        	  System.out.println(arg);
          }
	}//run(..)

}//class
