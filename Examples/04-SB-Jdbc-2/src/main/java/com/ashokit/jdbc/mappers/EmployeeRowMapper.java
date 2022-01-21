package com.ashokit.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ashokit.jdbc.models.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee  employee = new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setEname(rs.getString(2));
		employee.setSalary(rs.getDouble(3));
		employee.setDeptNo(rs.getInt(4));
		
		return employee;
	}

}
