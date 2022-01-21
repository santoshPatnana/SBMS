package com.ashokit.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jdbc.dao.IEmpDao;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	IEmpDao  empDao;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(empDao.findEmployeeByEmpid(7862));
		
		System.out.println("*************************************************************************");
		
		List lst = empDao.findEmployeesByDeptno(10);
		lst.forEach(System.out::println);
		
		System.out.println("*************************************************************************");
		
		int count = empDao.updateEmployeesSalaryByDeptno(11000.0, 20);
		System.out.println( count + " employee(s) are updated in Database ");
		

	}

}
