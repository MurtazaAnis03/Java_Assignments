package com.assignment;

public class Employee {
	private int id;
	private String name;
	private double monthlyBasic;
	
	public Employee(int id, String name, double monthlyBasic) {
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	
	public double getAnnualBasic() {
		return 12*monthlyBasic;
	}
	
	public double getMonthlyGrossSalary() {
		double hra = (monthlyBasic * 50)/100, medical = 1250, conveyance = 800;
		return monthlyBasic + hra + medical + conveyance;
	}
	
	public double getAnnualGrossSalary() {
		return (12 * getMonthlyGrossSalary());
	}
	
	public double getMonthlyDeductions() {
		double pf = 6500, esic = 0, profTax = 0;
		if((10 * getMonthlyBasic()/100) < pf ) {
			pf = (10*getMonthlyBasic()/100);
		}
		if(monthlyBasic <= 5000) {
			esic = (monthlyBasic * 4.75)/100;
		}
		if(getMonthlyGrossSalary() <= 10000) {
			profTax = 50;
		}
		else {
			profTax = 100;
		}
		return pf + esic + profTax;
	}
	
	public double getMonthlyTakeHome() {
		return (getMonthlyGrossSalary() - getMonthlyDeductions());
	}
	
	public double getAnnualTakeHome() {
		return (12 * getMonthlyTakeHome());
	}
	
/*	public float setPFRate(float f) {
		
	}
	public double getPFRate() {
	}
*/


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "John", 35000);
		
		System.out.println("ID: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Monthly Basic: "+emp.getMonthlyBasic());
		System.out.println("Annual Basic: "+emp.getAnnualBasic());
		System.out.println("Monthly Gross Salary: "+emp.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary: "+emp.getAnnualGrossSalary());
		System.out.println("Monthly Deductions: "+emp.getMonthlyDeductions());
		System.out.println("Monthly Takehome: "+emp.getMonthlyTakeHome());
		System.out.println("Annual Takehome: "+emp.getAnnualTakeHome());
	}

}
