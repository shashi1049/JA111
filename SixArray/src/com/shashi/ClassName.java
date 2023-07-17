package com.shashi;

public class ClassName {
	public static void main(String[] args) {
		//At the time of array creation it is compulsory to specify size.
		//It is legal to have a array with size 0.
		//max length of an array is 2147483647 which is in range of int.
		int[] zero = new int[0];
		int[] a = new int[3];
		int[][] b  = new int[4][2];
		double[] d = new double[5];
		short[] s = new short[8];
		boolean[] bo = new boolean[8];
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(d.getClass().getName());
		System.out.println(s.getClass().getName());
		System.out.println(bo.getClass().getName());
	}


}
