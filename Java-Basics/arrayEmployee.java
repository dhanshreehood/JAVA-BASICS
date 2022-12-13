package com.cybage.basic;

class Employeea
{
 int empID;
 String name;
 static  String msg;
 public Employeea() {
 
 }
 public Employeea(int empID, String name) {
this.empID=empID;
this.name=name;
 }
 public Employeea(int empID)
 {
this.empID=empID;
 }
String getEmployeeInfo()
{
return "empID=" + empID + "name=" + name;
}
static void displayMessage()
{
System.out.println(msg);
}
}

public class arrayEmployee {

public static void main(String[] args) {
Employeea employeea[]=new Employeea[5];
employeea[0]=new Employeea(1001,"Jhon");
employeea[1]=new Employeea(1002,"Sharvari");
employeea[2]=new Employeea(1005,"Sam");
employeea[3]=new Employeea(1003,"Nancy");
employeea[4]=new Employeea(1004,"Jhon");

for( Employeea e:employeea)
{
System.out.println(e.getEmployeeInfo());
}

}

}

