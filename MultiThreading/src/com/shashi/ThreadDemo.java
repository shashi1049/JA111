package com.shashi;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.start(); // If we write t.run() then run() will be called normally by main thread and
		// there will be only one thread and that is main.
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
