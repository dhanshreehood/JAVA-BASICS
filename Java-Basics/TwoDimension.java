package com.cybage.basic;

public class TwoDimension {

public static void main(String[] args) {
	int[] intArray=new int[10];
	intArray[0]=10;
	intArray[1]=10;
	
	int[] newArray= {2,4,56,7,4};
	int arr[][]= {{2,7},{5,7}};

// for loop in java
	for(int i=0; i<2;i++)
	{
	for(int j=0; j<2;j++)
	System.out.print(arr[i][j]+" ");
	System.out.println("");
	}

}

}