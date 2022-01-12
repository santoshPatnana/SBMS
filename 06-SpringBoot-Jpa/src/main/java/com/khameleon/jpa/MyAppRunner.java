package com.khameleon.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.khameleon.jpa.dao.AccountEntityRepository;
import com.khameleon.jpa.entity.AccountEntity;
import com.khameleon.jpa.enumer.AccountStatus;

@Component
public class MyAppRunner implements ApplicationRunner {
	
	@Autowired
	AccountEntityRepository acRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		AccountEntity ac = new AccountEntity();
		ac.setAccountNumber(23456783L);
		ac.setAccountHolderName("Durga Prasad");	
		ac.setBalance(75000);
		ac.setAccountStatus(AccountStatus.LOCKED);
		ac.setIfsc("SBIN007893");
		acRepo.save(ac);	
		
		acRepo.findAll().forEach(System.out::println);
		
		Optional<AccountEntity> aco =acRepo.findById(2345678L);
		if(aco.isPresent()) {
			AccountEntity ae = aco.get();
			System.out.println(ae);
		}
		*/
		
		/*
		List<String> list = new ArrayList<>();
		list.add("accountNumber");
		
		Sort sort = Sort.by("accountNumber");//by default ascending
		
		List<AccountEntity> accounts = acRepo.findAll(sort);
		accounts.forEach(System.out::println);
		
		System.out.println("***************sort by account balance**********************");
		
		Sort sortBal = Sort.by("balance").and(Sort.by("creationTime").descending());
		
		List<AccountEntity> listAccounts = acRepo.findAll(sortBal);
		listAccounts.forEach(System.out::println);
		*/
		/*
		System.out.println("*******************Pagination*****************************");
		Pageable pageable = PageRequest.of(0, 3);
		
		Page<AccountEntity> accounts = acRepo.findAll(pageable);
		
		accounts.forEach(System.out::println);
		System.out.println("*******************Pagination get content*****************************");
		List<AccountEntity> listAccountsContent = accounts.getContent();
		
		listAccountsContent.forEach(System.out::println);
		
		System.out.println("Pages count::"+accounts.getTotalPages());
		
		if(accounts.hasNext()) {		
			Pageable nextPage =  accounts.nextPageable();
			Page<AccountEntity> nextAccounts = acRepo.findAll(nextPage);		
			nextAccounts.forEach(System.out::println);
		}
		
		System.out.println("Page elements count::"+accounts.getNumberOfElements());
		*/
		System.out.println("**********************Balance = 5000.0*********************************");
		List<AccountEntity> listAccounts = acRepo.findByBalance(5000.0);
		listAccounts.forEach(System.out::println);
		System.out.println("***********************Balance greater than equal = 20000.0***************************************");
		List<AccountEntity> listAccounts1 = acRepo.findByBalanceGreaterThanEqual(20000.0);
		listAccounts1.forEach(System.out::println);
		System.out.println("***********************AccountHolderName like***************************************");
		List<AccountEntity> listAccounts2 = acRepo.findByAccountHolderNameLike("%Rao");
		listAccounts2.forEach(System.out::println);
		System.out.println("***********************Account status***************************************");
		List<AccountEntity> listAccounts3 = acRepo.findByAccountStatus(AccountStatus.LOCKED);
		listAccounts3.forEach(System.out::println);
	}

}
