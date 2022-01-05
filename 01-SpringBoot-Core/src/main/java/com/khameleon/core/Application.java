package com.khameleon.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PropertySourceFactory;

@SpringBootApplication
//@PropertySource(value="classpath:app.properties")// it won't work in spring boot
//use command line arguments > optional arguments should start with -- and key value pairs
//> java -jar /target/01-SpringBoot-Core-0.0.1-SNAPSHOT.jar --spring.config.location=claspath:app.properties
public class Application {
	//Added comments in 1-Branch
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
