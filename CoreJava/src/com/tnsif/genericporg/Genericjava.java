package com.tnsif.genericporg;

import java.util.ArrayList;

public class Genericjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list = new ArrayList();
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		//list.add(123);//type cast error
		for(Object obj:list) {
			String str = (String) obj;// type casting
			System.out.println(str);
		}
	}

}
