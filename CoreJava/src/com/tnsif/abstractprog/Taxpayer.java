//program to demonstrate abstract class
package com.tnsif.abstractprog;
//non concrete class
public abstract class Taxpayer {
	public abstract double calTax(); //abstract method
	protected double salary;
	
	public Taxpayer(double salary) { //parameterized constructor
		super();
		this.salary = salary;
	}

	public void display() {
		System.out.println("the tax payed is : "+calTax());
		
	}
}
