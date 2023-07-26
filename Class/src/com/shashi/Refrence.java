package com.shashi;

public class Refrence {
	int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Refrence r1 = new Refrence();
		r1.x = 50;
		System.out.println(r1.x);
		
		Refrence r2 = r1;
		System.out.println(r2.x);
		
		r1 = null; //null means eligiable for GC
		
		System.out.println(r1.x);// NullPOinterException.
		

	}

}
