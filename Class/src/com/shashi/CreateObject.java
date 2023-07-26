package com.shashi;

public class CreateObject {
	int x = 10;
	
	public static void main(String[] args) {
		CreateObject c1 = new CreateObject();
		c1.x = 40;
		System.out.println(c1.x);
		
		CreateObject c2 = new CreateObject();
		System.out.println(c2.x);
	}

}
