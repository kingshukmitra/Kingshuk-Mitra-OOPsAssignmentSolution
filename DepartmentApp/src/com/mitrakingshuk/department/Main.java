package com.mitrakingshuk.department;

// Driver class that creates instances of all departments and demonstrates their methods
public class Main {

	public static void main(String[] args) {
		
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		// Method overriding for first 3 methods and inheritance for the fourth
		System.out.println(" Welcome to"+ admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());  
		System.out.println();
		
		// Method overriding for first 4 methods and inheritance for the fifth
		System.out.println(" Welcome to"+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		// Method overriding for first 4 methods and inheritance for the fifth
		System.out.println(" Welcome to"+ tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();

	}

}
