package com.shashi;

public class var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();// var-arg method
		m1(10);//General method
		m1(10,20);//var-arg method

	}
	public static void m1(int... x) {
		System.out.println("Inside var-arg");
	}
	public static void m1(int x) {
		System.out.println("General Method");
		
	}

}
