package com.khameleon.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.khameleon.jdbc.model.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.seteName(rs.getString(2));		
		emp.setSalary(rs.getInt(3));
		emp.setDeptNo(rs.getInt(4));
		return emp;
	}

}
