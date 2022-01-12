package com.khameleon.jdbc.runner;

import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khameleon.jdbc.dao.IEmpDao;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	IEmpDao empDao;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number..");
		int emp = scan.nextInt();
		Map output = empDao.fetchEmployeeBonus(emp);
		System.out.println(output.get("EMPLOYEENAME").toString());
		System.out.println(output.get("BONUS"));
	}

}
