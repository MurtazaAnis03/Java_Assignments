package com.assignment.Assignment_2;

import java.util.ArrayList;
import java.util.Collections;

public class HighestPossibleNumber {
	public static long highestNumber(long number) {
		ArrayList<Long> array = new ArrayList<>();
		while(number > 0) {
			array.add(number%10);
			number = number/10;
		}
		Collections.sort(array);
		Collections.reverse(array);
		
		long num=0;
		for(int i=0; i<array.size(); i++) {
			num = (num*10)+array.get(i);
		}
		return num;
	}
}