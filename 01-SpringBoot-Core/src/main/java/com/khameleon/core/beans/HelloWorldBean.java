package com.khameleon.core.beans;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldBean {
	
	public String helloMessage() {
		return "Hello World";
	}
}
