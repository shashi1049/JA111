package com.shashi;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Statement 1");
		
		try {
			System.out.println(10/0);
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(10/2);
		}
		
		System.out.println("Statement 2");

	}

}
