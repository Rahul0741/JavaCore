package com.rahul.assignment4;

public class Bestoffer implements Amazon, Flipkart {
	
	
	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Hello, Welcome to the website : ");
		
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you, bye bye");
		
	}

	public void bestoffer() {
		//retrieving the offer price from Amazon
		int a = Amazon.offerprovided();
		
		//retrieving the offer price from FLipkart
		int b = Flipkart.offerprovided();
		//comparing the offers provided
		if(a<b)
		{
			System.out.println("So, the best offer provider is amazon with : "+a+" price");
		}
		else {
			System.out.println("the best offer provider is flipkart with : "+b+" price");
		}
		
	}

}
