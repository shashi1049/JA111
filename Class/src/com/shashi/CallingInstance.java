package com.shashi;

public class CallingInstance {
	int x = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
		CallingInstance c1 = new CallingInstance();
		c1.m1();

	}
	
	public void m1() {
		System.out.println(x);// we can directly call instance variable inside instance field.
	}

}
