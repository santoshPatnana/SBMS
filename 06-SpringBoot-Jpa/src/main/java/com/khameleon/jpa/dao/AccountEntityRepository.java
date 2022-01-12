package com.khameleon.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khameleon.jpa.entity.AccountEntity;
import com.khameleon.jpa.enumer.AccountStatus;

public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {
	List<AccountEntity> findByBalance(Double bal);
	
	List<AccountEntity> findByBalanceGreaterThanEqual(Double val);
	
	List<AccountEntity> findByAccountHolderNameLike(String match);
	
	List<AccountEntity> findByAccountStatus(AccountStatus accStatus);
}
