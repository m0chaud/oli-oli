package com.org.personaldev.firstpkg;

/**
 * @author: chaudharimehul
 * @date:	Apr 29, 2017
 * 
 * Worked on Non-primitive data type
 * Integer, String, Boolean, Float, Double
 * 
 * Worked on Array
 * 
 * Worked on Collection
 * ArrayList, List, LinkedList, Queue, Stack, 
 */
public class NonPrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------Byte Data Type---------------------");
		Byte byteDataType = 127; //8 bits - 1 Byte
		System.out.println("Byte Data Type " + byteDataType);

		System.out.println("---------------------Short Data Type---------------------");
		Short shortDataType = Short.valueOf(byteDataType);
		System.out.println("Short Data Type " + shortDataType);

		System.out.println("---------------------Integer Data Type---------------------");
		Integer integerDataType = Integer.valueOf(shortDataType);
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing Integer Data Type Value "+ integerDataType);
		System.out.printf("Printing Integer Data Type Value with white space %5d \n", integerDataType);
		System.out.println("Integer Minimum value " + Integer.MIN_VALUE +" --- Integer Max Value "+ Integer.MAX_VALUE);


		System.out.println("---------------------long Data Type---------------------");
		Long longDataType = Long.valueOf(shortDataType);
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing Long Data Type Value "+ longDataType);

		System.out.println("---------------------float Data Type---------------------");
		Float floatDataType = Float.valueOf(shortDataType);
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing Float Data Type Value "+ floatDataType);

		System.out.println("---------------------Double Data Type---------------------");
		Double doubleDataType = Double.valueOf(shortDataType);
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing Double Data Type Value "+ doubleDataType);

		System.out.println("---------------------Boolean Data Type---------------------");
		Boolean booleanDataType = Boolean.valueOf("TRUE");
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing Boolean Data Type Value "+ booleanDataType);

		System.out.println("---------------------String Data Type---------------------");
		String stringDataType = String.valueOf(byteDataType);
		// integerDataType = Integer.valueOf('A');
		System.out.println("Printing String Data Type Value "+ stringDataType);

		System.out.println("Printing individual character from String iterator ");
		String todaysDay = "Today is Saturday";
		for(char individualChar : todaysDay.toCharArray()){
			System.out.print("  " + individualChar);
		}
		System.out.println("\nPrinting individual character from String for loop ");
		for(int i = 0; i < todaysDay.length() ; i++){
			System.out.print("  "+todaysDay.charAt(i));
		}
		System.out.println("");

		System.out.println("Printing sub string from second character " + todaysDay.substring(1));
		System.out.println("Printing sub string from second character to third character "+todaysDay.substring(1, 2));
		
		System.out.println("Printing for Concatanation || " + todaysDay.concat(". Todays Date 04/29/2017 "));
		System.out.println("Usage of Contains method on String. || " + todaysDay.contains("Saturday") );
		
		System.out.println("Printing String in reverse");
		for(int i = todaysDay.length()-1 ; i >= 0; i--){
			System.out.print( todaysDay.charAt(i) );
		}
		System.out.println("");
		
		//System.out.println("Converting all character to lower character ");
		//System.out.println((int)('A')); 65
		//System.out.println((int)('a')); 97
		System.out.println("Converting String to all lower characters by adding 32 ");
		for(int i = 0 ; i < todaysDay.length() ; i++){
			System.out.print( (char) (todaysDay.charAt(i)< 97?todaysDay.charAt(i)+32:todaysDay.charAt(i) ) );
		}
		
		System.out.println("\nConverting all character to upper character by subtructing 32");
		for(int i = 0 ; i < todaysDay.length() ; i++ ){
			System.out.print((char) (todaysDay.charAt(i) >= 97?todaysDay.charAt(i)-32:todaysDay.charAt(i)) );
		}
		//StringBuilder
		//StringBuffer
	}

}
