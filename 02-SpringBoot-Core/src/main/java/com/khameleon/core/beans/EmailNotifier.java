package com.khameleon.core.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

@Service
public class EmailNotifier {
	
	@Autowired
	ApplicationArguments args;
	
	List<String> blockedEmails = new ArrayList<String>();
	
	public void populateBlockedEmails() {
		args.getNonOptionArgs().forEach(email -> blockedEmails.add(email));
		
		blockedEmails.forEach(System.out::println);
	}
	
	

}
