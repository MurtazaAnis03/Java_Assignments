package com.assignment.Assignment_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char ch;
		int array1[] = {1, 2, 4, 6, 3, 7, 8, 9, 10};
	    int array2[] = {10, 4, 3, 50, 23, 0, 8};
	    int array3[] = {1, 5, 10, 0, 20, 0};
	       do {
	    	   System.out.println("Assignment 1		Find the Missing Number");
	    	   System.out.println("Assignment 2		Find the Largest Three Elements");
	    	   System.out.println("Assignment 3		Find Common Elements");
	    	   System.out.println("Assignment 4		Move all Zeros to the End");
	    	   
	    	   System.out.println("Enter your choice: ");
	    	   int option = sc.nextInt();
	    	   
	    	   switch(option) {
	    	   case 1: 
	    		   System.out.println("Missing Number in the array is "+FindMissingNumber.findMissingNumber(array1)); 
	    		   break;
    	   
	    	   case 2: 
	    		   int newArray[]= LargestThreeElement.largestThreeElements(array2); 
	    		   for(int i=0;i<newArray.length;i++) 
	    		   {
	    			   System.out.print(newArray[i]+ " ");
	    		   } 
	    		   break;
    	   
	    	   case 3: 
	    		   int temp1[]= FindCommonElements.findCommonElements(array1, array2, array3); 
	    		   for(int i=0;i<temp1.length;i++) 
	    		   {
	    			   if(temp1[i] != 0)
	    				   System.out.print(temp1[i]+ " ");
	    		   }
	    		   break;
    	   
	    	   case 4: 
	    		   int newArray1[] = ZerosToEnd.zerosToEnd(array3);
	    		   System.out.println("Array with all zeros at the end: ");
	    		   for(int i=0;i<newArray1.length;i++)
	    		   {
	    			   System.out.print(newArray1[i]+" ");
	    		   } 
	    		   break;
	    	   }
	       System.out.println("\nDo you wish to continue? Y/N");
			ch = sc.next().charAt(0);
		}while(ch == 'Y');
	}

}
