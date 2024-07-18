package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(07, "dhoni","ranchi"));
		ar.add(new Student(45, "rohit","mumbai"));
		ar.add(new Student(18, "kholi","delhi"));
		
		//for Sorting by roll number(descending)
		System.out.println("---------------");
		Collections.sort(ar,new SortRollno());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//sorting by name(ascending)
		System.out.println("---------------");
		Collections.sort(ar,new SortName());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
