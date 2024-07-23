package com.tnsif.genericporg;

public class GenericMethod {
	public <T>void displayarray(T[] elements){//generic type method
		for(T ele:elements) {
			System.out.println("elements are : "+ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();
		Integer[] intarr = {10,25,48};
		String[] strarr = {"heyyy", "bro"};
		obj.displayarray(intarr);
		obj.displayarray(strarr);
	}

}
