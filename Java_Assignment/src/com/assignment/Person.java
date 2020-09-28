package com.assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
	private String name;
	private LocalDate dob;
	
	public Person(String name, int d, int m, int y) {
		this.name = name;
		this.dob = LocalDate.of(y, m, d);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDob() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return formatter.format(dob);
	}
	
	private String getAge() {
		LocalDate currentDate = LocalDate.now();
		int days = currentDate.getDayOfMonth() - dob.getDayOfMonth();
		int months = currentDate.getMonthValue() - dob.getMonthValue();
		int years = currentDate.getYear() - dob.getYear();
		return ("Age: "+years+" years "+months+" days "+days);
	}
	
	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Date of Birth: "+getDob());
		System.out.println("Age: "+getAge());
	}
	
	public String olderOne(Person p) {
		if(this.dob.isAfter(p.dob)) {
			Period pd = Period.between(p.dob, this.dob);
			return (p.name+" is older than "+this.name+" by "+pd.getYears()+" years "+pd.getMonths()+" months "+pd.getDays()+" years.");
		}
		else {
			Period pd = Period.between(this.dob, p.dob);
			return (this.name+" is older than "+p.name+" by "+pd.getYears()+" years "+pd.getMonths()+" months "+pd.getDays()+" years.");
		}
	}
	
	
	public static void main(String[] args) {
		Person person1 = new Person("Ram", 5, 6, 1980);
		person1.display();
		Person person2 = new Person("Shyam", 2, 3, 1987);
		person2.display();
		System.out.println(person1.olderOne(person2));
	}

}
