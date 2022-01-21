package com.ashokit.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {
	
	@Id
	@Column( name = "ADDR_ID")
	private Integer addressId;
	
	@Column(name = "CITY", length = 20)
	private String city;
	
	public AddressEntity() {
		// TODO Auto-generated constructor stub
	}

	public AddressEntity(Integer addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
