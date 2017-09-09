package com.compit.programming.basics.datatypes;

public class Primitive {

	/*
	 *  Java primitive data types are basic data types.
	 *  They are not classes or object.
	 *  byte, short, int, long, double, float, char,boolean are primitive data types.
	 *  They are directly stored in memory.
	 *  Unlike non-primitive data type which carries memory reference to actual data.
	 *  
	 *  Reference link 
	 *  Primitive vs non-primitive - http://cs.ucls.uchicago.edu/APCS_Resources/LecutreNotes/PassByReference.pdf
	 *  Data type size - http://cs.fit.edu/~ryan/java/language/java-data.html
	 *   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		System.out.printf("--> boolean with %%b option - %b \n", b);
		
		int i = 'm';
		System.out.printf("--> int with %%d print option - %d \n", i);
		System.out.printf("--> int with %%c print option - %c \n", i);
		
	}

}
