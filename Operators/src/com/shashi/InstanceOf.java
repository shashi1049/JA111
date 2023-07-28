package com.shashi;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);

	}

}
