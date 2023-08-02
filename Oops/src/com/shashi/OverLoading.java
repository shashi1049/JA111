package com.shashi;

public class OverLoading {
	
	public void m1() {
		System.out.println("No Arg Method.");
	}
	
	public void m1(int i) {
		System.out.println("int arg method.");
	}
	
	public void m1(double d) {
		System.out.println("Double arg method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading o = new OverLoading();
		
		o.m1();
		o.m1(10);
		o.m1(10.0);
	}

}
