package com.khameleon.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khameleon.jpa.dao.CustomersRepository;
import com.khameleon.jpa.entity.Customers;
import com.khameleon.jpa.entity.Locker;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CustomersRepository repo;
	
	@Override
	public void run(String... args) throws Exception {		
		Locker locker = new Locker();
		locker.setLockerId(1);
		locker.setRent(1000);
		
		Customers cust = new Customers();
		cust.setCustId(101);
		cust.setCustName("Santosh");
		cust.setLocker(locker);
		
		repo.save(cust);
		
	}

}
