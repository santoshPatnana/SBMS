package com.khameleon.core.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.khameleon.core.beans.HelloWorldBean;

@Component
@Order(2)
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	HelloWorldBean helloWorldBean;

	@Override
	public void run(String... args) throws Exception {		
		System.out.println(helloWorldBean.helloMessage());
	}

}
