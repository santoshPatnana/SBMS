package com.ashokit.jdbc.dao;

import java.util.List;

import com.ashokit.jdbc.models.Employee;

public interface IEmpDao {
	
	List<Employee>  fetchEmployees();

}
