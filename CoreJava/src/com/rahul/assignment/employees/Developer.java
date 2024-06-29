package com.rahul.assignment.employees;
//sub-class of Employee class
public class Developer extends Employee {
	
	private String Proglang;
	public Developer(String name, int employeeid, int salary, String Proglang) {
		super(name, employeeid, salary);
		this.Proglang=Proglang;
	}
	//getter and setter
	public String getProglang() {
		return Proglang;
	}

	public void setProglang(String proglang) {
		Proglang = proglang;
	}
	
}
