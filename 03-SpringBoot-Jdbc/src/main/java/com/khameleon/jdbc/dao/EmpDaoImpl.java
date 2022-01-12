package com.khameleon.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Map findEmployeeById(Integer empNo) {		
		return jdbcTemplate.queryForMap("select * from emp where empno = ?",empNo);
	}

	@Override
	public List findEmployeeByDeptNo(Integer deptNo) {		
		return jdbcTemplate.queryForList("select * from emp where deptno = ?", deptNo);
	}

	@Override
	public int updateEmployeesSalaryByDeptNo(Double salary, Integer deptNo) {		
		return jdbcTemplate.update("update emp set sal = ? where deptno = ?", salary, deptNo);
	}

}
