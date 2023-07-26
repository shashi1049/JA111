package com.shashi;

public class Main1 {
	static int x;// static
	int y;// instance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main1 m1 = new Main1();
		m1.x = 10;
		m1.y = 50;
		
		Main1 m2 = new Main1();
		m2.x = 40;// all value will be change because there is only one copy of static variable.
		m2.y =80;
		
		System.out.println(m1.x);
		System.out.println(m1.y);
		System.out.println(m2.x);
		System.out.println(m2.y);
		

	}

}
