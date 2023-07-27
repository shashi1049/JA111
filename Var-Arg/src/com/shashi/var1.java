package com.shashi;

public class var1 {
	
	public static void m1(int... x) {
		// Any number of arguement including zero arguement.
		System.out.println("Var-Arg method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);

	}

}
