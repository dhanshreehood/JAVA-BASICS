package com.cybage.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] intArray = new int[10]; //10 is the length of the array.
		
		intArray[0]=10;// declaration of value on the specified place.
		intArray[1]=20;
		
		//declaraing array directly with the value. 
		int[] newArray= {4,6,8,10,2,7};
			
		for(int i=0; i<newArray.length; i++) {
			System.out.println("Array length of newArray: "+ newArray[i]);
		
			for(int element:newArray)
				System.out.println(element);
		}
	}
}
