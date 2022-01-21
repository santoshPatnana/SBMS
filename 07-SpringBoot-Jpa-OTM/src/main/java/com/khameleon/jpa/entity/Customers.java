package com.khameleon.jpa.entity;

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
@Table(name="CUSTOMERS")
public class Customers {
	
	@Id
	private Integer custId;
	
	@Column(length=30)
	private String custName;
	
	private Long contact;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,orphanRemoval = true)//orphanRemoval deletes row
	@JoinColumn(name="CUSTID_FK", referencedColumnName = "CUSTID")	
	private Collection<Orders> orders;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(Integer custId, String custName, Long contact) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.contact = contact;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Collection<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Collection<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + ", contact=" + contact + ", orders=" + orders
				+ "]";
	}
			
}
