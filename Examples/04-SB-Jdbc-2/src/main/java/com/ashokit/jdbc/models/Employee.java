package com.ashokit.jdbc.models;

public class Employee {
	
	private int empId;
	private String ename;
	private double salary;
	private int  deptNo;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", deptNo=" + deptNo + "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	

}
