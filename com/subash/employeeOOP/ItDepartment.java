package com.subash.employeeOOP;

public class ItDepartment extends employee {
private String designation;
	
	
	

	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	@Override
	double CalculateSalary(String designation) {
		if(designation.equals("Manager")) {
			return 5000;
		}
		if(designation.equals("Sr developer")) {
			return 4000;
		}
		return 2000;	
	}
	
	@Override
	public String toString() {
		return "IT Department [designation=" + designation + ", EmployeeNumber=" + getEmployeeNumber() + ", EmployeeName=" + getEmployeeName()
			 + ", salary= "+CalculateSalary(designation)+"]";
	}

}
