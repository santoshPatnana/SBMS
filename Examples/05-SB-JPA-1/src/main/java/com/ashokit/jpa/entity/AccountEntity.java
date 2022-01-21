package com.ashokit.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "ACCOUNTS")
@NamedQuery(name = "AccountEntity.fetchAccountsBasedOnUpdateTime", 
            query = "SELECT ae FROM AccountEntity ae where ae.updateTime = ?1 ")
public class AccountEntity {
	
	@Id
	private Long accountNumber;
	
	@Column(length = 25)
	private String accountHolderName;
	
	@Column(length = 25)
	private String ifsc;
	
	private Double balance;
	
	@CreationTimestamp
	private LocalDateTime  creationTime;
	
	@UpdateTimestamp
	private LocalDateTime updateTime;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus  accountStatus;
	
	public AccountEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
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
		return "AccountEntity [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", ifsc="
				+ ifsc + ", balance=" + balance + ", creationTime=" + creationTime + ", updateTime=" + updateTime
				+ ", accountStatus=" + accountStatus + "]";
	}
	

}
