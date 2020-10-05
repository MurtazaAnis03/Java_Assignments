package com.assignment.Assignment_Inheritance;

public abstract class Training {
	public int id;
	public String subject;
	public double fees;
	
	public Training(int id, String subject, double fees) {
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}
	
	public abstract double getOrderValue();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
}