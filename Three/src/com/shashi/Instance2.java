package com.shashi;

public class Instance2 {

	
		
		int x=10;
		public static void main(String[] args){
		Instance2 obj1=new Instance2();
		obj1.x=50;
		System.out.println(obj1.x); //50
		Instance2 obj2=obj1;
		System.out.println(obj2.x); //50
		}

	

}
