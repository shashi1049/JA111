package com.shashi;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		
		//length of an array
		//length variable is  used to find the length of an array.
		//length() is used to find the length of String obj.
		int size = arr.length;
		System.out.println(size);
		
		String[] s = {"A","AA","AAA","AAAA"};
		System.out.println(s.length);//4
		//System.out.println(s.length());//C.E
		//System.out.println(s[1].length);//CE
		System.out.println(s[1].length());//2
		
		//multiDi array
		//length represent only base size not complete size.
		int[][] y = new int[6][3];
		System.out.println(y.length);//6
		System.out.println(y[0].length);//3

	}

}
