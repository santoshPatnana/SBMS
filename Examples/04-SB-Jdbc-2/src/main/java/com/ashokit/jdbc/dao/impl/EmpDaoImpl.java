package com.ashokit.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.jdbc.dao.IEmpDao;
import com.ashokit.jdbc.mappers.EmployeeRowMapper;
import com.ashokit.jdbc.models.Employee;

@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> fetchEmployees() {
		
		return jdbcTemplate.query(" SELECT * FROM EMP ", new EmployeeRowMapper());
	}

}
