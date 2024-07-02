package com.tnsif.abstractprog;

public class Akash extends Taxpayer{

	public Akash(double salary) {
		super(salary);
	}
	
	public double calTax() {
		if(salary<=500000) {
			return salary * 0.10;
		}
		else
		{
			return salary * 0.20;
		}
	}
}
