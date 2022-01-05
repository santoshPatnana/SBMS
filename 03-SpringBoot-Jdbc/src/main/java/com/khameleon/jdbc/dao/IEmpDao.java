package com.khameleon.jdbc.dao;

import java.util.List;
import java.util.Map;

public interface IEmpDao {
	public Map findEmployeeById(Integer empNo);
	public List findEmployeeByDeptNo(Integer deptNo);
	public int updateEmployeesSalaryByDeptNo(Double salary,Integer deptNo);
}
