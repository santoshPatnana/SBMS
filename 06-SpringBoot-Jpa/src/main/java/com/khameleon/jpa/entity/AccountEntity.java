package com.khameleon.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.khameleon.jpa.enumer.AccountStatus;

@Entity
@Table(name = "Accounts")
public class AccountEntity {
	@Id
	private long accountNumber;
	
	@Column(length = 25)
	private String accountHolderName;
	
	@Column
	private double balance;
	
	@Column(length = 25)
	private String ifsc;
	
	@CreationTimestamp
	private LocalDateTime creationTime;
	
	@UpdateTimestamp
	private LocalDateTime updateTime;
	
	@Enumerated(EnumType.STRING)
	AccountStatus accountStatus;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}		
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "AccountEntity [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", balance=" + balance + ", ifsc=" + ifsc + ", creationTime=" + creationTime + ", updateTime="
				+ updateTime + ", accountStatus=" + accountStatus + "]";
	}

	
	
	
}
