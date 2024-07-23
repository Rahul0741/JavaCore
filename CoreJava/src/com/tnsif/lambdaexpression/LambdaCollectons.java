package com.tnsif.lambdaexpression;

import java.util.ArrayList;

public class LambdaCollectons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(07);
		li.add(56);
		li.forEach(e->System.out.println(e));//using lambda expression
	}
		
}
