package com.tnsif.genericporg;

public class Demo {
	public static void main(String[] args) {
		Generic <String> sobj = new Generic();
		sobj.setData("heyyy");
		System.out.println("the string object is : "+sobj.getData());
		
		Generic <Integer> iobj = new Generic();
		iobj.setData(07);
		System.out.println("the integer object is : "+iobj.getData());
		
		Generic <Double> dobj = new Generic();
		dobj.setData(45.18);
		System.out.println("the double object is : "+dobj.getData());
	}
}
