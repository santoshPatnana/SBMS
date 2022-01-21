package com.khameleon.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class AddressEntity {
	@Id
	Integer addressId;
	
	@Column(length=25)
	String city;

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

	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", city=" + city + "]";
	}
}
