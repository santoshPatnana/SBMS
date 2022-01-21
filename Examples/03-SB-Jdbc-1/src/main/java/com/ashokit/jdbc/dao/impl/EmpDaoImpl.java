package com.ashokit.jdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.jdbc.dao.IEmpDao;

@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Map findEmployeeByEmpid(Integer empno) {
		return jdbcTemplate.queryForMap( "SELECT * FROM EMP WHERE EMPNO = ?", empno);
	}

	@Override
	public List findEmployeesByDeptno(Integer deptno) {
		return jdbcTemplate.queryForList("SELECT * FROM EMP WHERE DEPTNO = ?", deptno);
	}

	@Override
	public int updateEmployeesSalaryByDeptno(Double newSalary, Integer deptno) {
		return jdbcTemplate.update("UPDATE EMP SET SAL = ? WHERE DEPTNO = ? ", newSalary, deptno);
	}

}
