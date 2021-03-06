package com.khameleon.jdbc.runner;

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
		System.out.println(empDao.findEmployeeById(1));
		System.out.println(empDao.findEmployeeByDeptNo(20));
		System.out.println(empDao.updateEmployeesSalaryByDeptNo(1000.0, 20));
	}

}
