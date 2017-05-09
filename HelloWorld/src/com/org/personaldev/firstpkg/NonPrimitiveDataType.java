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
		System.out.println("Short Minimum value " + Short.MIN_VALUE +" --- Integer Max Value "+ Short.MAX_VALUE); 

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
		
		System.out.println("\n---------------------String Builder---------------------");
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("First line in String builder in . -");
		strBuilder.append('C');
		System.out.println("string builder length " + strBuilder.length());
		System.out.println("string builder  character at 3 "+strBuilder.charAt(3));
		System.out.println("string builder Indexof method " + strBuilder.indexOf("in"));
		System.out.println("string builder print out: -- " +  strBuilder);
		System.out.println("string builder to String: -- " +  strBuilder.toString());
		
		
		System.out.println("\n---------------------String Buffer---------------------");
		
		//StringBuffer is synchronized. (StringBuilder is not)
		
		Integer nCount =  8000000;
		StringBuffer strBuffer = new StringBuffer();
		
		long time = System.currentTimeMillis();
		System.out.println("Before appending on String Buffer ");
		for(int i = 0 ; i <  nCount ; i++ ){
			strBuffer.append(""+i);
		}
		System.out.println("After appending on String Buffer "+ (System.currentTimeMillis() - time) );
		
		//StringBuilder is comparatively faster than StringBuffer
		StringBuilder strBuilder2 = new StringBuilder();
		time = System.currentTimeMillis();
		System.out.println("Before appending on String Builder ");
		for(int i = 0 ; i < nCount; i++ ){
			strBuilder2.append(""+i);
		}
		System.out.println("After appending on String Builder " + (System.currentTimeMillis() - time) );
		
		
		System.out.println("\n---------------------Multi dimensional array---------------------");		
		//int[][] array = new int[2][3];
		int[][] array = { {1,2,3}, {4,5,6} };
		for(int i = 0; i < array.length; i++){
			for(int k = 0; k < array[i].length ;k ++){
				System.out.print("--" + array[i][k] + "--");
			}
			System.out.println("");
		}
		
		//StringBuilder
		//StringBuffer
	}

}
