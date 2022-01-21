package com.ashokit.jpa.runner;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.jpa.entities.CustomerEntity;
import com.ashokit.jpa.entities.OrderEntity;
import com.ashokit.jpa.repositories.CustomerEntityRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
		
	@Autowired
	CustomerEntityRepository repo;
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		/* ***************** ADD CUSTOMER *********************************
		
		CustomerEntity customer1 = new CustomerEntity(1011, "Allen", 9008007001L);
		
		OrderEntity order1 = new OrderEntity(190021, LocalDate.now(), true);
		OrderEntity order2 = new OrderEntity(288767, LocalDate.of(2022, 1, 5), false);
		OrderEntity order3 = new OrderEntity(455208, LocalDate.of(2022, 1, 12), true);
		
		Collection<OrderEntity> ordersCollection = new ArrayList<>();
		ordersCollection.add(order1);
		ordersCollection.add(order2);
		ordersCollection.add(order3);
		
		customer1.setOrders(ordersCollection);
		
		repo.save(customer1);
		*/
		
		// *************  FETCH CUSTOMER ******************************
		/*
		CustomerEntity  customer = repo.findById(1011).get();
		System.out.println(customer);
		*/
		
		//*********** Fetch Customer with CashOnDelivery orders using join **********************
		/*
		List<Object[]>  lst = repo.fetchCustomerWithCashOnDeliveryOrders(1011, true);
		lst.forEach( obj -> System.out.println("customer name : "+obj[0]+", order id : "+obj[1]+", order date : "+obj[2]));
		*/
		
		//********** remove an order from customer ***************
		
		CustomerEntity  customer = repo.findById(1011).get();
		Collection<OrderEntity> orders = customer.getOrders();
		for(OrderEntity ord : orders) {
			if(ord.getOrderId() == 288767) {
				orders.remove(ord);
			}
		}
		orders.forEach(System.out::println);
		
	}

}
