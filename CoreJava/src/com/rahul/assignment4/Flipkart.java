package com.rahul.assignment4;

public interface Flipkart {
	void welcome();
	void thankyou();
	
	static int offerprovided() {
		int amt = 2500;
		System.out.println("the offer provided by flipkart is : "+amt);
		return amt;
	}
	static void aboutUs() {
		System.out.println("Its is e-commerce website ");
	}

}
