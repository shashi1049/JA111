package com.shashi;

public class Static {
	static int i = 10;
	
	public static void fun1(){
		System.out.println("inside fun1 of Demo");
		}
		public static void main(String[] args){
		//using directly
		System.out.println(i);
		fun1();
		//by using class name
		System.out.println(Static.i);
		Static.fun1();
		//using by an object
		Static obj=new Static();
		System.out.println(obj.i);
		obj.fun1();
		}


}
