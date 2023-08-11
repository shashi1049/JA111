package com.shashi;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("start");
		
		//append()
		sb.append("le");
		System.out.println(sb);
		
		//reverse()
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(0, 3, "No"));
		

	}

}
