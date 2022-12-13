package com.cybage.basic;

class Employeec{
	int empid;
    String name;
    
    //constructor
    public Employeec(int empid, String name) {
    	//this.empid = empid;
    	this(empid);
    	this.name = name;
    }
    
    public Employeec(int empid) {
    	this.empid = empid;
    }
	
	String getEmployeecInfo()
	{
		return "empid="+empid+"\n"+"name="+name;
	}
}

public class Constructor_Employee {
	public static void main(String[] args) {
		
		Employeec employee=new Employeec(1002, "Jahapanah");		
	
		System.out.println(employee.getEmployeecInfo());
	}
}


