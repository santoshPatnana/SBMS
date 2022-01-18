package com.khameleon.jpa.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.khameleon.jpa.entity.AccountEntity;
import com.khameleon.jpa.enumer.AccountStatus;

public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {
	List<AccountEntity> findByBalance(Double bal);
	
	List<AccountEntity> findByBalanceGreaterThanEqual(Double val);
	
	List<AccountEntity> findByAccountHolderNameLike(String match);
	
	List<AccountEntity> findByAccountStatus(AccountStatus accStatus);
	
	@Query(value="select ae.accountNumber,ae.balance from AccountEntity ae where ae.balance > ?1")
	List<Object[]> fetchAccountNumberAndBalances(double val);
	
	@Query(value="select ae.accountNumber,ae.balance from AccountEntity ae where ae.balance > :balance")
	List<Object[]> fetchAccountNumberAndBalances1(@Param("balance") double val);
	
	@Query(value="select * from accounts where ifsc = ?", nativeQuery=true)
	List<AccountEntity> fetchAccountsBasedOnIfsc(String ifsc);
	
	List<AccountEntity> fetchAccountsBasedOnUpdateTime(LocalDateTime time);
	
	List<AccountEntity> fetchAccountsBasedStatus(AccountStatus status);
	
}
