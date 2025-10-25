package com.tnsif.dayeleven.v1;

public class Arrayoprations {
int intArray[] ;
	
	public Arrayoprations() {
		super();
		
	}

	public Arrayoprations(int[] intArray) {
		super();
		this.intArray = intArray;
		
	}
	
	public void displayArray() {
		for(int no:intArray) {
			System.out.println("The array elements are: "+no);
		}
	}
	
	public int getElement(int position) {
		return intArray[position];
	}
	

}
