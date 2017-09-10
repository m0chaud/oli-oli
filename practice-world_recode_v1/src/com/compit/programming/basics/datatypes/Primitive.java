package com.compit.programming.basics.datatypes;

import java.util.Arrays;
import java.util.Random;

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
		boolean bol = false;
		System.out.printf("--> boolean with %%b option - %b \n", bol);

		byte b = 67;
		System.out.printf("--> byte with %%d print option - %d \n", b);
		System.out.printf("--> byte with %%c print option - %c \n", b);		

		System.out.printf(" %7s %7s %7s %s \n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);

		short s = 1000;
		System.out.printf("--> short with %%d print option - %d \n", s);

		int i = 'm';
		System.out.printf("--> int with %%d print option - %d \n", i);
		System.out.printf("--> int with %%c print option - %c \n", i);

		char c = 65;	
		//System.out.printf("--> char with %%d print option - %d \n", c); - this conversation is not working
		System.out.printf("--> char with %%c print option - %c \n", c);
		System.out.printf("--> char with %%d print option - %d \n", (int)c ); 

		int[] array = new int[10];

		Random r = new Random();
		for(i = 9 ; i > 0 ; i--){
			//array[9-i] = i;
			array[i] = r.nextInt(50);

		}

		for(i = 0 ; i < array.length ; i++){
			for(int k = i ; k < array.length ; k++){
				if(array[i] > array[k]){					
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
		//Arrays.sort(array);

		for(int k : array){
			System.out.printf(" %4d| ", k);
		}
		System.out.println("");

		long l = 2000000;
		System.out.printf("--> long with %%d print option - %d \n" , l);
		System.out.printf("--> long with %%c print option - %c \n" , (char)l);
	
		float f = 67.5f;
		
		System.out.printf("--> float with %%d print option - %d \n", (int)f);
		System.out.printf("--> float with %%c print option - %c \n", (char)f);
		System.out.printf("float %%f - %f \n", f);		
		
		double d = 98.578;
		System.out.printf("--> double with %%d print option - %d \n", (int)d);
		System.out.printf("--> double with %%c print option - %c \n", (char)d);
		System.out.printf("--> double with %%f print option - %2.2f \n", d);
	}

}
