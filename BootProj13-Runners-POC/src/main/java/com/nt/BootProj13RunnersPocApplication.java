package com.nt;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class BootProj13RunnersPocApplication {
	
	@Bean
	@Order(0)
	public   CommandLineRunner  createTestAlertRunner() {
		CommandLineRunner clr=args->	System.out.println("TestAlert Runner");
		return clr;
	}
	
	@Bean
	@Order(-2)
	public   ApplicationRunner  createSMSTestAlertRunner() {
		ApplicationRunner ar=aa->	System.out.println("SMSTestAlert Runner");
		return ar;
	}


	public static void main(String[] args) {
		SpringApplication.run(BootProj13RunnersPocApplication.class, args);
	}

}
