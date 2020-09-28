package com.assignment.MM_Bank;

public class PaymentGateway {
	public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
	{
		if(sender.getBalance() > amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			sender.display();
			reciever.display();
			return true;
		}
		else {
			System.out.println("Cannot transfer amount. Not enough balance");
			sender.display();
			return false;
		}
	}
}
