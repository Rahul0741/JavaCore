package com.rahul.assignment4;

public interface Amazon {
	void welcome();
	void thankyou();
	
	static int offerprovided() {
		int amt = 1000;
		System.out.println("the offer provided by amazon is : "+amt);
		return amt;
	}
	static void aboutUs() {
		System.out.println("Its is e-commerce website ");
	}

}
