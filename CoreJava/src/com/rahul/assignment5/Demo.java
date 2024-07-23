package com.rahul.assignment5;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the account number");
			int accountNo = sc.nextInt();
			System.out.println("Enter the initial amount to be added to account");
			double balance = sc.nextDouble();
			BankAccount obj = new BankAccount(accountNo, balance);
			try {
				System.out.println("Enter the amount to deposit");
				double depositamount = sc.nextDouble();
				obj.deposit(depositamount);
			} catch (Invalidamount e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Enter the amount to withdraw");
				double withdrawalamount = sc.nextDouble();
				obj.withdrawal(withdrawalamount);
			} catch(Invalidamount | Insufficientbalance e) {
				System.out.println(e.getMessage());
			}
		}
		catch(Invalidamount e){
			System.out.println("Account creation is unsuccessful"+e.getMessage());
		}
		
	}

}
