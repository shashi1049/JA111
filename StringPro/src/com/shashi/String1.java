package com.shashi;

public class String1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Masai";
		//length()
		System.out.println(s.length());
		
		//charAt()
		System.out.println(s.charAt(0));
		
		//substring()
		System.out.println(s.substring(2));
		System.out.println(s.substring(1, 4));
		
		//concat()
		
		System.out.println(s.concat("school"));
		
		//indexOf()
		System.out.println(s.indexOf("as"));
		
		System.out.println(s.indexOf("as", 2));
		
		//equals()
		System.out.println(s.equals("Masai"));
		System.out.println(s.equals("Masa"));
		System.out.println(s.equalsIgnoreCase("MASAI"));
		
		//toUpperCase()
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//trim()
		System.out.println(s.trim());
		
		//replace()
		System.out.println(s.replace('a', 'm'));
		
		//toCharArray()
		System.out.println(s.toCharArray());
		
		String s1="Sachin";
		String s2="Sachin";
		String s3="Ratan";
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//1(because s1>s3)
		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
		
		
	}

}
