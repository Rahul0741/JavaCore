package com.rahul.assignment.employees;
//sub class of Employee class
public class Manager extends Employee {
	private int experience;
	
	public Manager(String name, int employeeid, int salary, int experience) {
		super(name, employeeid, salary);
		this.experience=experience;
	}
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
