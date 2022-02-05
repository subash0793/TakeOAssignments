package com.subash.employeeOOP;

public abstract class employee {
	private int employeeNumber;
	private String employeeName;
	private String department;
	
	public employee() {
	this.employeeName=employeeName;
	this.employeeNumber=employeeNumber;
	this.department=department;
	}
	
	public employee(int eno, String ename, String desi) {
		this.employeeName=ename;
		this.department=desi;
		this.employeeNumber=eno;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	abstract double  CalculateSalary(String designation);

}
