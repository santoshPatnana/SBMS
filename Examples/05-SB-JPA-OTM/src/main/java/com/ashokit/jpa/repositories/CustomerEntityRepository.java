package com.ashokit.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.jpa.entities.CustomerEntity;

@Repository
public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {
	
	@Query("SELECT cust.customerName, ord.orderId, ord.orderDate from CustomerEntity cust JOIN cust.orders ord WHERE cust.customerId=?1 and ord.isCashOnDelivery=?2")
	public List<Object[]>  fetchCustomerWithCashOnDeliveryOrders(Integer customerId, boolean cashOnDelivery);

}
