package com.ashokit.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.jpa.entities.AddressEntity;
import com.ashokit.jpa.entities.CustomerEntity;
import com.ashokit.jpa.repositories.CustomerEntityRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CustomerEntityRepository  repo;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// ********* add customers with address *******************
		/*
		CustomerEntity cust1 = new CustomerEntity();
		cust1.setCustomerId(101);
		cust1.setCustomerName("A");
		
		CustomerEntity cust2 = new CustomerEntity();
		cust2.setCustomerId(102);
		cust2.setCustomerName("B");
		
		AddressEntity  addr = new AddressEntity();
		addr.setAddressId(90218);
		addr.setCity("Hyderabad");
		
		cust1.setAddress(addr);
		cust2.setAddress(addr);
		
		repo.save(cust1);
		repo.save(cust2);
		*/
		
		//************* Fetch a customer *********************
		CustomerEntity ce = repo.findById(101).get();
		AddressEntity addr = ce.getAddress();
		System.out.println(addr.getAddressId());
		System.out.println(addr.getCity());
		
	}

}
