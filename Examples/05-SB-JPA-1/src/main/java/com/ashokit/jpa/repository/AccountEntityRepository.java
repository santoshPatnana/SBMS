package com.ashokit.jpa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ashokit.jpa.entity.AccountEntity;
import com.ashokit.jpa.entity.AccountStatus;

@Repository
public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {
	
	List<AccountEntity>  findByAccountStatus(AccountStatus accStatus);
	
	//@Query(value = "SELECT ae.accountNumber, ae.balance FROM AccountEntity ae where ae.balance > ?1")
	@Query(value = "SELECT ae.accountNumber, ae.balance FROM AccountEntity ae where ae.balance > :balance ")
	List<Object[]>  fetchAccountNumbersAndBalances(@Param("balance") double bal);
	
	@Query( value = "SELECT * FROM ACCOUNTS WHERE IFSC = ?", nativeQuery = true)
	List<AccountEntity>  readAccountsBasedOnIfsc(String ifsc);
	
	
	List<AccountEntity> fetchAccountsBasedOnUpdateTime(LocalDateTime updateTime);

}
