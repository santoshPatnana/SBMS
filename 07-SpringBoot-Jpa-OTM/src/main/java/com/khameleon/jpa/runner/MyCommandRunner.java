package com.khameleon.jpa.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.khameleon.jpa.dao.CustomersRepository;
import com.khameleon.jpa.entity.Customers;
import com.khameleon.jpa.entity.Orders;



@Component
public class MyCommandRunner implements CommandLineRunner{
	
	@Autowired
	CustomersRepository repo;
	
	@Transactional //it provides single transaction to this complete run method..
	@Override
	public void run(String... args) throws Exception {	
		/*
		Customers cust = new Customers(101,"Santosh",7382528487L);
		
		Orders ord1 = new Orders(9001,LocalDateTime.now(),true);
		Orders ord2 = new Orders(9002,LocalDateTime.now(),true);
		Orders ord3 = new Orders(9003,LocalDateTime.now(),true);
		Orders ord4 = new Orders(9004,LocalDateTime.now(),true);
		Collection<Orders> orders = new ArrayList<>();
		orders.add(ord1);
		orders.add(ord2);
		orders.add(ord3);
		orders.add(ord4);
		cust.setOrders(orders);
		
		repo.save(cust);
		*/
		/*
		Customers cust = repo.findById(101).get();
		Collection<Orders> list = cust.getOrders();
		//list.forEach(System.out::println);
		Orders removeOrder = null;
		for(Orders order : list ) {
			if(order.getOrderId() == 9002)
				removeOrder = order;
		}
		
		list.remove(removeOrder);
		
		list.forEach(System.out::println);
		*/
		
		List<Object[]> orders = repo.fetchCustomerWithCashOnDeliveryOrders(101, true);
		orders.forEach(order -> System.out.println("CustName:"+order[0]+"OrderId:"+order[1]+"OrderDate:"+order[2]));
	}

}
