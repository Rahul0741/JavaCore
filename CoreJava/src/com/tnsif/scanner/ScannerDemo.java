package com.tnsif.scanner;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the customer name: ");
		String name=ob.nextLine();
		
		System.out.println("Enter the source: ");
		String source=ob.nextLine();
		
		System.out.println("Enter the destination: ");
		String destination=ob.nextLine();
		
		System.out.println("Dear "+name+ " welcome onboard with service from "+source+" to "+destination+". Thank you for\r\n"
				+ "choosing Sky Airlines. Enjoy your flight");
	}

}
