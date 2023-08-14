package com.shashi;

public class Outer {
	class Inner{
		public void m1() {
			System.out.println("Inner Class Method.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		 i.m1();

	}

}
