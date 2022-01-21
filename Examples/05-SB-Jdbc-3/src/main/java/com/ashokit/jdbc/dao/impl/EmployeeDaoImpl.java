package com.ashokit.jdbc.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ashokit.jdbc.dao.IEmployeeDAO;

@Repository
public class EmployeeDaoImpl implements IEmployeeDAO {
	
	@Autowired
	SimpleJdbcCall  simpleJdbcCall;

	@Override
	public Map fetchEmployeeBonusByEmpid(Integer empNo) {
		
		simpleJdbcCall.withProcedureName("find_employee_bonus");
		Map<String, Object> inParameters = new HashMap<>();
		inParameters.put("employeeNo", empNo);
		
		Map<String, Object> outParameters = simpleJdbcCall.execute(inParameters);
		
		return outParameters;
		
	}

}
