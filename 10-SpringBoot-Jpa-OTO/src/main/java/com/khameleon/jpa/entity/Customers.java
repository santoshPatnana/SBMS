package com.khameleon.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS_ENTITY")
public class Customers {
	
	@Id
	private Integer custId;
	
	@Column
	private String custName;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "LOCKERID_FK",unique = true,nullable = false)//unique = true makes it one to one mapping 
	private Locker locker;

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

	public Locker getLocker() {
		return locker;
	}

	public void setLocker(Locker locker) {
		this.locker = locker;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + "]";
	}		
	
}
