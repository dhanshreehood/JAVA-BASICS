package com.cybage.basic;

//public class Asterick_Pattern {
//
//	public static void main(String[] args) {
//		int rows=3;
//		System.out.println(" Print the Pattern: ");
//		
//		for(int i = 1; i<=rows; i++) {
//			for(int j = rows; j>i; j--) {
//				System.out.println(" ");
//			}
//			for(int k = 1; k<=(i*2)-1; k++) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
//	}
//
//}


public class Asterick_Pattern
{  
    public static void pyramidPattern(int n) 
    {  
    	int i;
        for (i=0; i<n; i++) 
            { 
                System.out.print(" "); 
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("*"); 
                System.out.println();
            } 
  
            System.out.println();
        }

  
    public static void main(String args[]) 
    { 
        int n = 5; 
        pyramidPattern(n); 
    } 
}