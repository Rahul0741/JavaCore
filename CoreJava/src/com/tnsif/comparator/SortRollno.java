package com.tnsif.comparator;

import java.util.Comparator;

public class SortRollno implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return b.rollno-a.rollno;
	}
	
}
