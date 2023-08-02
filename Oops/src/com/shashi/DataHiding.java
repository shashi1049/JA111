package com.shashi;

public class DataHiding {
	
	private int x; // Data Hiding.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHiding d = new DataHiding();
		
		d.getBalance();

	}
	public int getBalance() {
		
		// validation
		return x;
	}

}
