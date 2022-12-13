package com.cybage.basic;

 class Employee{
	int empid;
    String name;

	String getEmployeeInfo()
	{
		return "empid="+empid+"\n"+"name="+name;
	}
}


public class EmployeeDemo {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.empid=1001;
		employee.name="jackson";
		
		System.out.println(employee.getEmployeeInfo());
		
	}
}
