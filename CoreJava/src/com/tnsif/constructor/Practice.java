package com.tnsif.constructor;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pincode;
		int mask=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			pincode = sc.nextInt();
			i=i+1;
			if(pincode%2==0) {
				mask = mask+100;
			}
		}
		
		System.out.println("masks ordered are:"+mask);
	}

}
