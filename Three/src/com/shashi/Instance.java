package com.shashi;

public class Instance {
	int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance obj1=new Instance();
		obj1.x=50;
		System.out.println(obj1.x); //50
		Instance obj2=new Instance();
		System.out.println(obj2.x); //10

	}

}
