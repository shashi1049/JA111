package com.shashi;

public class Cons3 {
	
	public Cons3() {
		this(10);
		System.out.println("No-arg");
	}

	public Cons3(int i) {
		// TODO Auto-generated constructor stub
		this(10.5);
		System.out.println("int-arg");
	}

	public Cons3(double d) {
		// TODO Auto-generated constructor stub
		System.out.println("double-arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons3 c = new Cons3();
		Cons3 c1 = new Cons3(10);
		Cons3 c2 = new Cons3(10.5);
		Cons3 c3 = new Cons3(10l);

	}

}
