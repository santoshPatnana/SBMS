package com.ashokit.jpa.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {
	
	@Id
	private Integer orderId;
	
	private LocalDate orderDate;
	
	private Boolean isCashOnDelivery;
	
	public OrderEntity() {
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(Integer orderId, LocalDate orderDate, Boolean isCashOnDelivery) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.isCashOnDelivery = isCashOnDelivery;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getIsCashOnDelivery() {
		return isCashOnDelivery;
	}

	public void setIsCashOnDelivery(Boolean isCashOnDelivery) {
		this.isCashOnDelivery = isCashOnDelivery;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", orderDate=" + orderDate + ", isCashOnDelivery=" + isCashOnDelivery
				+ "]";
	}
	
	

}
