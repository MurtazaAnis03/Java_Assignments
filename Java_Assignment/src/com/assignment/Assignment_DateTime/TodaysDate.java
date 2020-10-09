package com.assignment.Assignment_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TodaysDate {
	public static void main(String [] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		System.out.println(formatter.format(date));
		
		DayOfWeek day = date.getDayOfWeek();
		Month month = date.getMonth();
		int datte = date.getDayOfYear();
		int year = date.getYear();
		System.out.println(day+", "+month+" "+datte+", "+year);
	}
}