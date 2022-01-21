package com.khameleon.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Orders {
	@Id
	private Integer orderId;
	
	private LocalDateTime orderDate;
	
	private Boolean isCashOnDelivery;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(Integer orderId, LocalDateTime orderDate, Boolean isCashOnDelivery) {
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

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
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
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", isCashOnDelivery=" + isCashOnDelivery
				+ "]";
	}	
		
}
