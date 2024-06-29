package com.rahul.assignment.utilities;
import com.rahul.assignment.employees.Employee;
public class EmployeeUtilities {
	//print employee details
	public static void EmpDetail(Employee emp) {
		System.out.println("Name: "+emp.getName());
		System.out.println("EmpId: "+emp.getEmployeeid());
		System.out.println("Salary"+emp.getSalary());
	}
}
