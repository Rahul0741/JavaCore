package com.tnsif.lambdaexpression;

public class Withoutparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Message m = () -> {return "hello";	};
//		System.out.println(m.greet());
		Cube c = (a) -> {return a*a*a ;};
		System.out.println(c.cal(5));
	}

}
