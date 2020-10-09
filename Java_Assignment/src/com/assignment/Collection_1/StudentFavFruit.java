package com.assignment.Collection_1;

import java.util.HashMap;
import java.util.Map;

public class StudentFavFruit {
	public static void main(String [] args) {
		Student s1 = new Student("Abhijeet", "Mango");
		Student s2 = new Student("Mohit", "Strawberry");
		Student s3 = new Student("Rishi", "Kiwi");
		Student s4 = new Student("Husain", "Apple");
	
	Map<String, String> favFruit = new HashMap<>();
		favFruit.put(s1.getName(), s1.getFruit());
		favFruit.put(s2.getName(), s2.getFruit());
		favFruit.put(s3.getName(), s3.getFruit());
		favFruit.put(s4.getName(), s4.getFruit());
	
		for(String s: favFruit.keySet()) {
			System.out.println(s+" "+favFruit.get(s));
		}
	}
}