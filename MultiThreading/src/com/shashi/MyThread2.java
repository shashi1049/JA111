package com.shashi;

public class MyThread2 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Seeta Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
