package com.rahul.assignment5;

public class BankAccount {
	double totalbalance;
	public BankAccount(int accountNo, double balance) throws Invalidamount {
		if(balance<500) {
			throw new Invalidamount("balance amount addded is less than 500");
		}
		totalbalance = balance;
	}
	public void deposit(double amount) throws Invalidamount{
		if(amount < 100) {
			throw new Invalidamount("depositing amount must be minimum 100");
		}
		totalbalance +=amount;
		System.out.println("deposited amount is : "+amount);
		System.out.println("Current TotalBalance is : "+totalbalance);
	}
	public void withdrawal(double amount) throws Invalidamount, Insufficientbalance{
		if(amount < 100) {
			throw new Invalidamount("minimum withdrawal amount is 100");
		}
		if(amount>totalbalance) {
			throw new Insufficientbalance("Insufficient balance"+totalbalance);
		}
		totalbalance -=amount;
		System.out.println("New Totalbalance is :\n"+totalbalance);
	}
	
	
}
