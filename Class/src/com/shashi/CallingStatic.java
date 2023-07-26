package com.shashi;

public class CallingStatic {
	
	static int i;
	
	public static void fun() {
		System.out.println("inside fun");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Directly;
		System.out.println(i);
		fun();
		
		// Using Class
		
		System.out.println(CallingStatic.i);
		CallingStatic.fun();
		
		// Using Object
		
		CallingStatic c1 = new CallingStatic();
		System.out.println(c1.i);
		c1.fun();
		

	}

}
