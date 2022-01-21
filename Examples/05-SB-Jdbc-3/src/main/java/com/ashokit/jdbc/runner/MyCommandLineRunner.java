package com.ashokit.jdbc.runner;

import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jdbc.dao.IEmployeeDAO;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	IEmployeeDAO  dao;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee Number : ");
		int empNo = scan.nextInt();
		
		Map<String, Object>  output = dao.fetchEmployeeBonusByEmpid(empNo);
		
		System.out.println("Employee Name : "+ output.get("EMPLOYEENAME").toString());
		System.out.println("Employee bonus: "+ output.get("BONUS").toString());

	}

}
