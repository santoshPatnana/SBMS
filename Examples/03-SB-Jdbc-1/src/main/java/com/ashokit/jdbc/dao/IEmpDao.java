package com.ashokit.jdbc.dao;

import java.util.List;
import java.util.Map;

public interface IEmpDao {
	
	Map findEmployeeByEmpid(Integer empno);
	
	List findEmployeesByDeptno(Integer deptno);
	
	int updateEmployeesSalaryByDeptno(Double newSalary, Integer deptno);

}
