package com.khameleon.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.khameleon.jpa.dao.CustomerEntityRepository;
import com.khameleon.jpa.entities.AddressEntity;
import com.khameleon.jpa.entities.CustomerEntity;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CustomerEntityRepository repo;
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		/*
		AddressEntity address = new AddressEntity();
		address.setAddressId(101);
		address.setCity("Vizag");
		*/
		/*
		CustomerEntity customer = new CustomerEntity();
		customer.setCustId(901);
		customer.setCustName("Santosh");
		customer.setAddress(address);
		*/
		/*
		CustomerEntity customer = new CustomerEntity();
		customer.setCustId(902);
		customer.setCustName("Kumar");
		customer.setAddress(address);
		
		repo.save(customer);
		*/
		
		CustomerEntity customer = repo.findById(901).get();
		System.out.println(customer);
	}

}
