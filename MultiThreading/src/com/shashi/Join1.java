package com.shashi;

public class Join1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread2 t = new MyThread2();
		t.start();
		t.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}

	}

}
