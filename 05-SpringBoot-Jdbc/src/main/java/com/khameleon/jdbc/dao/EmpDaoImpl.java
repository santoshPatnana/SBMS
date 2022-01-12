package com.khameleon.jdbc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map fetchEmployeeBonus(int empNo) {
		simpleJdbcCall.withProcedureName("find_employee_bonus");
		Map<String,Object> map = new HashMap<>();
		map.put("employeeNo", empNo);
		return simpleJdbcCall.execute(map);
	}

}
