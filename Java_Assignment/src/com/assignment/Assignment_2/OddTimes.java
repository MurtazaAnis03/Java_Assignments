package com.assignment.Assignment_2;

public class OddTimes {
	public static int oddTimes(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				if(count % 2 != 0)
					return arr[i];
			}
		}
		return -1;
	}
}
