package com.tnsif.threads;

public class Firstway extends Thread {
	public void run() {
		System.out.println("creation of thread class by extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firstway ob = new Firstway();
		
		ob.start();
		ob.stop();
	}

}
