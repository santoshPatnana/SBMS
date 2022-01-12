package com.khameleon.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.khameleon.jdbc.mapper.EmpRowMapper;
import com.khameleon.jdbc.model.Employee;

@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> fetchEmployees() {		
		return jdbcTemplate.query("select empno,ename,sal,deptno from emp", new EmpRowMapper());
	}

}
