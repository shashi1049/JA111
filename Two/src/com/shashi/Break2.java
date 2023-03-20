package com.shashi;

public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)// Outer loop
		{
		for(int j=0; j<10; j++)// Nested Loop
		{
		if(j==5)
		break;
		System.out.println(i+" "+j);
		} // end of nested loop
		}


	}

}
