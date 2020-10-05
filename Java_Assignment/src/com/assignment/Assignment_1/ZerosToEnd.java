package com.assignment.Assignment_1;

public class ZerosToEnd {
	public static int[] zerosToEnd(int[] array) {
		int first=0, last=array.length-1;
		while(first < last) {
			if(array[first] != 0)
				first++;
			if(array[last] ==0)
				last--;
			if(array[first] == 0 && array[last] != 0) {
				int temp = array[first];
				array[first] = array[last];
				array[last] = temp;
				first++; last--;
			}
		}
	return array;
	}
}