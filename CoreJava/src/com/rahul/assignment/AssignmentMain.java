package com.rahul.assignment;
import com.rahul.assignment.employees.*;
import com.rahul.assignment.utilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager("Rahul", 07, 30000, 7);
		Developer dv = new Developer("Akash", 25, 25000, "python");
		System.out.println("Manager Details: ");
		EmployeeUtilities.EmpDetail(mg);
		System.out.println("Developer Details: ");
		EmployeeUtilities.EmpDetail(dv);
		
	}

}
