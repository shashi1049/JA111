package com.shashi;


public class Class{
	int x=10; //instance variable
	public static void main(String[] args){
		int y=10; //local variable of main mehtod
		System.out.println(y); // 10
		//System.out.println(x);//error
}
}

class Main{
	int x=10;
	public static void main(String[] args){
		int y=10;
		System.out.println(y);
		Main1 obj=new Main1();// after creating obj of class we can use non static variable.
		System.out.println(obj.x);
}
}

