package com.khameleon.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.khameleon.jpa.entity.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
	
	@Query(value = "select c.CUST_NAME, o.ORDER_ID, o.ORDER_DATE from Customers c inner join  Orders o on c.CUST_ID = o.CUSTID_FK where c.CUST_ID = ? and o.IS_CASH_ON_DELIVERY = ?", nativeQuery=true)
	//@Query(value = "select c.custName, o.orderId, o.orderDate from Customers c INNER JOIN  Orders o WHERE c.custId = ?1 and o.isCashOnDelivery = ?2")
	List<Object[]> fetchCustomerWithCashOnDeliveryOrders(Integer custId,Boolean isCashOnDelivery);

}
