package com.shashi;

public class Parent {
	
	int y =10;
	
	public void p1() {
		System.out.println("function p1 of parent class.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Child extends Parent{
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.p1();
	}
	
}
