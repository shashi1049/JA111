package com.shashi;

public class MyThread1 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}

}
