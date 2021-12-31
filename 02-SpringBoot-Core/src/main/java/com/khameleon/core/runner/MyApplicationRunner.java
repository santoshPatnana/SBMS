package com.khameleon.core.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.khameleon.core.beans.EmailNotifier;

@Component
public class MyApplicationRunner implements ApplicationRunner {
	
	@Autowired
	EmailNotifier notifer;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		List<String> nonOptionsList = args.getNonOptionArgs();
		
		System.out.println("Non option list..");		
		nonOptionsList.forEach(System.out::println);
		
		Set<String> optionKeys = args.getOptionNames();
		
		System.out.println("Option list...");		
		optionKeys.forEach(key -> {
			List<String> optionValues = args.getOptionValues(key);
			//optionValues.forEach(System.out::println);
			System.out.println(key + " -> "+ optionValues);
		});
		*/
		notifer.populateBlockedEmails();
	}

}
