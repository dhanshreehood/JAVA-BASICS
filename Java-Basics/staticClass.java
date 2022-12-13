package com.cybage.basic;

class Employees{
	int empid;
    String name;
    static String msg;
    
    //constructor
    public Employees(int empid, String name) {
    	//this.empid = empid;
    	this(empid);
    	this.name = name;
    }
    
    //static ex:----
    public Employees(int empid) {
    	this.empid = empid;
    }
	
	String getEmployeesInfo()
	{
		return "empid="+empid+"\n"+"name="+name+"\n";
	}
	
	static void displaymsg() {
		System.out.println(msg);
	}
}

public class staticClass {
	public static void main(String[] args) {		
		Employees employee=new Employees(1002, "Jahapanah");
		Employees employee1=new Employees(1003, "sara");
		
		employee.msg="Namaskar ye rahe hamare karmachariyo ke naam: \n";
		employee.displaymsg();
	
		System.out.println(employee.getEmployeesInfo());
		System.out.println(employee1.getEmployeesInfo());
		System.out.println(employee.msg);
		
		employee.msg = "Modified message";
		System.out.println(employee.msg);
		System.out.println(employee1.msg);

		
		
		
		
		
		
		
		
		

	}
}


