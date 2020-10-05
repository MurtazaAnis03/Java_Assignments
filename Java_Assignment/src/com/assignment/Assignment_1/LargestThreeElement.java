package com.assignment.Assignment_1;

import java.util.Arrays;

public class LargestThreeElement {
	public static int[] largestThreeElements(int[] array) {
		Arrays.sort(array);
		int[] resultArray = new int[3];
		for(int i=0; i<3; i++) {
			resultArray[i] = array[array.length-i-1];
		}
		return resultArray;
	}
}
