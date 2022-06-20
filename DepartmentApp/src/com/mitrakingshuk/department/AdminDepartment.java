package com.mitrakingshuk.department;

// Sub class that inherits from SuperDepartment
public class AdminDepartment extends SuperDepartment {

	// 3 methods of the subclass that take no parameters
	// All 3 methods will perform method overriding at runtime
	String departmentName() {

		return " Admin Department ";
	}

	String getTodaysWork() {

		return "Complete your documents Submission";
	}
	
	String getWorkDeadline() {

		return "Complete by EOD ";
	}
	
}
