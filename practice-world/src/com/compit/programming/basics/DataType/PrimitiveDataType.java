package com.compit.programming.basics.DataType;

/**
 * @author: chaudharimehul
 * @date:	Apr 28, 2017
 * 
 * 
 * Work on DataType
 * Primitive
 * byte, short, int, long, float, double, boolean
 * 
 * https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
 * 
 * 
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//byte - 8 bits - 1 Byte -  -128 to 127 - 2^7 - 1 bit for +/-
		//short - 16 bits - 2 Byte - -32,768 to 32,767 - 2^15 - 1 bit for +/-
		//int - 32 bits - 4 Byte - -2,147,483,648 to 2,147,483, 647 - 2^31
		//long - 64 bits - 8 Byte - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - 2^63
		//float - 32 bits - 4 Byte 
		//double - 64 bits - 8 Bytes
		//boolean -  1 bit -
		//char - 16 bits - 2 Byte - 0 to 65,536
		
		
		/*
		 * byte data type
		 */
		
		System.out.println("---------------------byte Data Type---------------------");
		byte byteDataType = 127; //8 bits - 1 Byte
		System.out.println("Byte Data Type " + byteDataType);

		/*
		 * short data type
		 */
		
		System.out.println("---------------------short Data Type---------------------");
		short shortDataType = 32000; //16 bits - 1 Byte
		System.out.println(shortDataType);
		shortDataType = byteDataType;
		
		/*
		 * int data type
		 */
		
		System.out.println("---------------------int Data Type---------------------");
		int intDataType = 10; //32 bits - 4 Byte
		
		//Printing with two different format
		System.out.println(intDataType);
		System.out.printf("Printing with white space with s option %5s\n", intDataType); //It will print left adjust 5 space and print integer value
		System.out.printf("printing with white space with d option %5d\n", intDataType); //Same as above


		intDataType = '1'; // It will assign ascii value for char '1' to intger. Which is 49 
		char converFromIntToChar = (char) intDataType; // 
		System.out.println("int value " + intDataType); //this will print 49
		System.out.println("char value " + converFromIntToChar); // this will print '1'

		System.out.println("int converted to String " + String.valueOf(intDataType));

		/*
		 * char data type
		 */
		
		System.out.println("---------------------char Data Type---------------------");
		char charDataType = 'b';
		
		System.out.println(charDataType);
		System.out.printf("character printing %c",charDataType);

		System.out.println("char converted to String "+String.valueOf(charDataType)); //It will print b, but as a String
		System.out.printf("char converted to int %d \n", (int)charDataType); // It will print 98, ascii value of 'b'

		
		/*
		 * float data type
		 */
		System.out.println("---------------------float Data Type---------------------");
		float floatDataType = 10.4f;
		System.out.println("Printing Float Data Type " + floatDataType);
		System.out.printf("Printing Float Data Type with white space %5.2f \n ", floatDataType);
		
		//floatDataType = charDataType;
		/*
		 * double data type
		 */
		System.out.println("---------------------double Data Type---------------------");
		double doubleDataType = 10.4;
		System.out.println("Printing double data type " + doubleDataType);
		System.out.printf("printing double data type with white space %20.5f \n" , doubleDataType);
		
		/*
		 * boolean data type
		 */
		System.out.println("---------------------boolean Data Type---------------------");
		boolean booleanDataType = true;
		System.out.println("Printing boolean data type " + booleanDataType);
		
	}

}
