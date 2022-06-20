package com.mitrakingshuk.department;

//Sub class that inherits from SuperDepartment
public class TechDepartment extends SuperDepartment {

	// First 3 methods will perform method overriding at runtime
	String departmentName() {

		return " Tech Department ";
	}

	String getTodaysWork() {

		return "Complete coding of Module 1";
	}
	
	String getWorkDeadline() {

		return "Complete by EOD ";
	}
	
	String getTechStackInformation() {
		
		return " Core Java";
	}
	
}
