package com.finalvariable;

public class EmployeeDetails {
	
	final int id; // blank final variable
	
	EmployeeDetails(int idNum) 	{
		id = idNum;
	}
	
	void getDetails() {
		System.out.println("ID of the employee is: " + id);
	}

	public static void main(String[] args) {
	
		EmployeeDetails emp = new EmployeeDetails(15);
		emp.getDetails();
		
	}

}
