package com.khameleon.jdbc.model;

public class Employee {
	private int empId;
	private String eName;
	private int salary;
	private int deptNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + ", deptNo=" + deptNo + "]";
	}
	
}
