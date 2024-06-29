package com.rahul.assignment2;
import java.util.Scanner;
public class Commission {

	private String name, address, phoneNo;
	private int salesamt;
	private double commission;
	
	public void empdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Enter the address: ");
		address = sc.nextLine();
		System.out.println("Enter the phone No: ");
		phoneNo = sc.nextLine();
		System.out.println("Enter the sales amount: ");
		salesamt = sc.nextInt();
	}
	public double commissioncalculator() {
		if (salesamt >= 100000) {
			commission = salesamt + (salesamt * 0.1);
		}
		else if( salesamt >= 50000 && salesamt < 100000) {
			commission = salesamt + (salesamt * 0.05);
		}
		else if( salesamt >= 30000 && salesamt < 50000) {
			commission = salesamt + (salesamt * 0.03);
		}
		else {
			commission = 0;
		}
		return commission;
	}
}
