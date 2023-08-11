package com.shashi;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		Test t = new Test();
		System.out.println(t.getName());
		
		t.setName("shashi");
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Pawan");
		System.out.println(Thread.currentThread().getName());

	}

}
