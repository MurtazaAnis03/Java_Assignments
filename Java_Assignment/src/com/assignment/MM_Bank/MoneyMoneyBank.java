package com.assignment.MM_Bank;

public class MoneyMoneyBank {

	public static void main(String[] args) {
		SavingsAccount a1 = new SavingsAccount("John");
		a1.display();
		a1.deposit(5000);
		a1.display();
		a1.withdraw(2000);
		a1.display();
		a1.withdraw(5000);
		a1.display();
		
		SavingsAccount a2 = new SavingsAccount("Max", 2000);
		a2.display();
		a2.deposit(1000);
		a2.display();
		a2.withdraw(500);
		a2.display();
		a2.withdraw(5000);
		a2.display();
		
		PaymentGateway.transfer(a1, a2, 1000);
		
	}

}
