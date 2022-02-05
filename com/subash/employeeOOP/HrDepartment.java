package com.subash.employeeOOP;

public class HrDepartment extends employee {
private String designation;
	
	
	

	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}



	@Override
	double CalculateSalary(String designation) {
		if(designation.equals("Hr Manager")) {
			return 5000;
		}
		if(designation=="Hr assistant") {
			return 4000;
		}
		return 0;	
	}
	@Override
	public String toString() {
		return "HR Department [designation=" + designation + ", EmployeeNumber=" + getEmployeeNumber() + ", EmployeeName=" + getEmployeeName()
			 + ", salary= "+CalculateSalary(designation)+"]";
	}

}
