package com.shashi;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		//2D array is not implemented in matrix form.
		//It is array of arrays
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		
		//array initialization.
		int[] x = new int[3];
		System.out.println(x);//ClassName@ hashcode in hexa-decimal code.
		System.out.println(x[0]);//once we create the array, default value of elements are 0.
		
		
		//overriding values of array
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		
		// we can also declare,create and initalize an array in single line.
		
		int[][] y = {{10,20},{30,40,50}}; 
		System.out.println(y[0][1]);
	}
}
