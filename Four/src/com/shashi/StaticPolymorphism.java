package com.shashi;

public class StaticPolymorphism {
	
	void fun1(byte b){
		System.out.println("inside fun1(byte) of Demo");
		//500 line of code
		}
		void fun1(int i){
		System.out.println("inside fun1(int) of Demo");
		//10000 line of code
		}
		public static void main(String[] args)
		{
			StaticPolymorphism d1=new StaticPolymorphism();
		byte x=20;
		d1.fun1(x); // it will give the priority to the nearest one.
		}

}
