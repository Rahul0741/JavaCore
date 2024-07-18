package com.tnsif.collectionsprog;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Laptop>lap = new ArrayList<Laptop>();//created lap of type Laptop
		lap.add(new Laptop("hp",45000,8));
		lap.add(new Laptop("asus",75000,16));
		lap.add(new Laptop("lenovo",55000,8));
		Collections.sort(lap);
		for(Laptop l:lap) {
			System.out.println(l);
		}
	}

}
