package com.shashi;

public class Concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "shashi";
		int b = 10, c=20, d=30;
		System.out.println(a+b+c+d);//shashi102030
		System.out.println(b+c+d+a);//60shashi
		System.out.println(b+c+a+d);//30shashi30
		System.out.println(b+a+c+d);//10shashi2030

	}

}
