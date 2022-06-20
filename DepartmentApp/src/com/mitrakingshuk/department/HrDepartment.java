package com.mitrakingshuk.department;

//Sub class that inherits from SuperDepartment
public class HrDepartment extends SuperDepartment {

	// First 3 methods will perform method overriding at runtime
	String departmentName() {

		return " Hr Department ";
	}

	String getTodaysWork() {

		return "Fill today's worksheet and mark your attendance";
	}
	
	String getWorkDeadline() {

		return "Complete by EOD ";
	}
	
	String doActivity() {
		
		return "team Lunch";
	}
	
}
