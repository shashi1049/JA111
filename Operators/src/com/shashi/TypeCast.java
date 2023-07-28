package com.shashi;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implicit
		int x = 'a';
		System.out.println(x);//97
		
		double d = 10;
		System.out.println(d);//10.0
		
		
		//Explicit
		int a = 20;
		byte b = (byte)a;
		System.out.println(b);
		
		double e = 234.54;
		int f = (int)e; // 234 digit after . will be lost.

	}

}
