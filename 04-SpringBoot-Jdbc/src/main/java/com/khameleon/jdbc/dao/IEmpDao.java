package com.khameleon.jdbc.dao;

import java.util.List;

import com.khameleon.jdbc.model.Employee;

public interface IEmpDao {
	public List<Employee> fetchEmployees();
}
