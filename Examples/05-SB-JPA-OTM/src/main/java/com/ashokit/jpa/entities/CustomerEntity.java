package com.ashokit.jpa.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class CustomerEntity {
	
	@Id
	private Integer customerId;
	
	@Column(length = 20)
	private String customerName;
	
	private Long contact;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "CUSTOMERID_FK" )
	private Collection<OrderEntity>  orders;
	
	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(Integer customerId, String customerName, Long contact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contact = contact;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Collection<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(Collection<OrderEntity> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", contact=" + contact
				+ ", orders=" + orders + "]";
	}
	
	
	

}
