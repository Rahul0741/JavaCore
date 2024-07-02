package com.tnsif.abstractprog;

public class Hitesh extends Taxpayer{

	public Hitesh(double salary) {
		super(salary);
	}
	public double calTax(){
		
		return salary * 0.15;
	}
}