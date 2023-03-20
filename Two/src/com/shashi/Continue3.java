package com.shashi;

public class Continue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("before Loop");
		for(int i=0;i<10;i++)
		{
		if(i == 5)
		{
		System.out.println("Inside Loop, before continue");
		continue;
		//System.out.println("Inside Loop, After continue");// Ureachable statement
		}
		}
		System.out.println("After loop");

	}

}
