package com.assignment.Collection_1;

public class Car implements Comparable<Car> {
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null && this!=null && obj instanceof Car) {
			if(this.make == ((Car)obj).make && this.model == ((Car)obj).model) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return make.hashCode() ^ model.hashCode();
	}
	
	public int compareTo(Car car) {
		int c = this.make.compareTo(car.make);
		if(c > 0)
			return 1;
		else if(c<0)
			return -1;
		return 0;
	}
}