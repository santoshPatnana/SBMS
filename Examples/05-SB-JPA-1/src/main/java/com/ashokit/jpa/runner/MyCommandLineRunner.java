package com.ashokit.jpa.runner;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.entity.AccountEntity;
import com.ashokit.jpa.entity.AccountStatus;
import com.ashokit.jpa.repository.AccountEntityRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	AccountEntityRepository  repo;

	@Override
	public void run(String... args) throws Exception {
		
		//add account
		/*
		AccountEntity  accountEntity = new AccountEntity();
		accountEntity.setAccountNumber(200400488L);
		accountEntity.setAccountHolderName("Ravi Kiran");
		accountEntity.setBalance(2000.0);
		accountEntity.setIfsc("SBIN0003434");
		accountEntity.setAccountStatus(AccountStatus.UNLOCKED);
		repo.save(accountEntity);
		*/
		
		//Fetch all accounts from Database
		/*
		List<AccountEntity>  lstAccounts = repo.findAll();
		lstAccounts.forEach(System.out::println);
		*/
		
		//Fetch a specific account from Database
		/*
		Optional<AccountEntity>  opt = repo.findById(200100211L);
		if(opt.isPresent()) {
			AccountEntity accEntity = opt.get();
			System.out.println(accEntity);
		} */
		
		//*************** sorting ******************************
		
		/*
		Sort  sort = Sort.by("accountNumber");
		List<AccountEntity>  lstAccounts = repo.findAll(sort);
		lstAccounts.forEach(System.out::println);
		*/
		
		/*
		Sort sort = Sort.by("balance").and(Sort.by("accountHolderName"));
		List<AccountEntity>  lstAccounts = repo.findAll(sort);
		lstAccounts.forEach(System.out::println);
		*/
		
		//**************** pagination ***********************
		/*
		Pageable pageable = PageRequest.of(1 , 2);
		Page<AccountEntity>  accounts = repo.findAll(pageable);
		List<AccountEntity>  lstOfAccounts = accounts.getContent();
		lstOfAccounts.forEach(System.out::println);
		System.out.println("Total pages :"+ accounts.getTotalPages());
		System.out.println("is nextpage exists ? : "+ accounts.hasNext());
		*/
		
		//************** findByAccountStatus *********************
		
		/*		
		List<AccountEntity>  lstAccounts = repo.findByAccountStatus(AccountStatus.LOCKED);
		lstAccounts.forEach(System.out::println);
		
		System.out.println("=======================================================================");
		
		List<Object[]>  objArr = repo.fetchAccountNumbersAndBalances(1500.0);
		objArr.forEach(obj -> System.out.println("Accno  : "+ obj[0]+", Balance : "+obj[1]));
		
		System.out.println("=======================================================================");
		
		List<AccountEntity>   lstOfAccounts = repo.readAccountsBasedOnIfsc("SBIN0003435");
		lstOfAccounts.forEach(System.out::println);
		*/
		
		//****************** fetchAccountsBasedOnUpdateTime ******************************
		LocalDateTime  updateTime = LocalDateTime.of(2022, 1, 8, 7, 11, 7, 843000000);
		List<AccountEntity>  lstAccountsOnUpdateTime = repo.fetchAccountsBasedOnUpdateTime(updateTime);
		lstAccountsOnUpdateTime.forEach(System.out::println);
		
	}
	

}
