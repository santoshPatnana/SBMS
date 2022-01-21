package com.khameleon.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUST_ENTITIES")
public class CustomerEntity {
	@Id
	Integer custId;
	
	@Column(length=25)
	String custName;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)//default fetch type is eager
	@JoinColumn(name="ADDRESS_ID_FK")
	AddressEntity address;

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

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerEntity [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	
}
