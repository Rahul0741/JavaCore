//program to demonstrate interface
package com.tnsif.interfaceprogram;

public interface Amazon {
	void welcome();
	void thankyou();// abstract
	
	default void servicecharge() {
		int amt = 100;
		System.out.println("the service charge is : "+amt);
	}
	static void aboutUs() {
		System.out.println("Its is e-commerce concept ");
	}
	
}
