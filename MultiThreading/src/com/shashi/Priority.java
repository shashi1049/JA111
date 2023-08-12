package com.shashi;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		Test t = new Test();
		System.out.println(t.getPriority());
		

	}

}
