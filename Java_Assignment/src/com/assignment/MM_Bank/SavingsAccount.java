package com.assignment.MM_Bank;

public class SavingsAccount {
	private String name;
	private int accountNo;
	private double balance;
	
	private static int Initial_Account_No = 100;
	
	{
		this.accountNo = Initial_Account_No;
		Initial_Account_No++;
	}
	
	public SavingsAccount(String name) {
		this(name,0);
	}

	public SavingsAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}
	
	public static void getNextAccountNo() {
		System.out.println("Next Account Number will be: "+(Initial_Account_No));
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double withdraw) {
		if(balance > 0) {
			balance -=withdraw;
		}
		else {
			System.out.println("Cannot withdraw amount. Your account balance is "+balance);
		}
	}
	
	public void display() {
		System.out.println("Your Account Details: ");
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
	}
}
