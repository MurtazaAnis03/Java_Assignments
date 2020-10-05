package com.assignment.Assignment_2;

public class CountDuplicates {
	public static int countDuplicates(String str) {
		int count = 0;
		String s = str.toLowerCase();
		char [] characters = new char[26];
		int [] numbers = new int[10];
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				int ch = s.charAt(i);
				System.out.println("Character "+ch);
				characters[ch-97]++;
			}
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				int ch = s.charAt(i);
				System.out.println("Numbers "+ch);
				numbers[ch-48]++;
			}
		}
		
		for(int i=0,j=0; i<26 || j<10; i++,j++) {
			if(characters[i] > 1)
				count++;
			if(j<10) {
				if(numbers[i] > 1)
					count++;
			}
		}
		return count;
	}
}
