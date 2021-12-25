package com.khameleon.core.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyCommandLineRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {		
		System.out.println("With in MyCommandLineRunner2");
	}

}
