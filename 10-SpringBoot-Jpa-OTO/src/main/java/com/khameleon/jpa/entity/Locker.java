package com.khameleon.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCKER_ENTITY")
public class Locker {
	@Id
	private Integer lockerId;
	
	@Column
	private Integer rent;

	public Integer getLockerId() {
		return lockerId;
	}

	public void setLockerId(Integer lockerId) {
		this.lockerId = lockerId;
	}

	public Integer getRent() {
		return rent;
	}

	public void setRent(Integer rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Locker [lockerId=" + lockerId + ", rent=" + rent + "]";
	}
	
	

}
