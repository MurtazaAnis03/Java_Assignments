package com.assignment.Assignment_1;

public class FindMissingNumber {
		public static int findMissingNumber(int[] array) {
			int actualSum = 0, n = array.length+1;
			for(int i=0; i<array.length; i++) {
				actualSum += array[i];
			}
			
			int expectedSum = n*(n+1)/2;
			int missingNumber  = expectedSum - actualSum;
			return missingNumber;
		}
}
