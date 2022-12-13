package com.cybage.basic;

public class HelloWorld {

	public static void main(String[] args) {
//	System.out.println("Hello World!");
		
		int n1 = 10;
		double d = 10.4;
		float pi = 3.14f;
		byte b = 20;
		
		double cn = (double) n1;  //Type Casting
		long l = 3456;
		
		//Type Casting
		int n2=(int)l;
		
		System.out.println("n1="+n1);
		System.out.println("d="+d);
		System.out.println("pi="+pi);
		System.out.println("b="+b);
		System.out.println("cn="+cn);
		System.out.println("l="+l);
	}

}
