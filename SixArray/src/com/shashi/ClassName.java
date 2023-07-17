package com.shashi;

public class ClassName {
	public static void main(String[] args) {
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
