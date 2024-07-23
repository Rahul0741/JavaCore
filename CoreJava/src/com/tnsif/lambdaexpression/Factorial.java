package com.tnsif.lambdaexpression;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		Facto f=(a)->{
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		};
		System.out.println(f.cal(n));		}
}
