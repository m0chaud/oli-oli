package com.compit.programming.basics.dissectstring;

import java.util.Arrays;

/**
 * @author: chaudharimehul
 * @date:	May 9, 2017
 * String is char[].
 * This class is created to practice over String and char[] data types
 * Our natural language is made of Strings (Words). It becomes very important to have good handle working with String.
 * Exception use cases are not handled in this implementation
 */
public class StringPractice1 {

	public char[] subString(String str, int beginIndex){
		// exceptions cases are not handled in this implementation
		char[] output = new char[str.length() - beginIndex];

		int k = 0;

		for(int i = beginIndex ; i < str.length() ; i++){
			output[k] = str.charAt(i);
			k++;
		}
		return output;
	}

	public char[] subString(String str, int beginIndex, int endIndex){

		char[] output = new char[endIndex - beginIndex];

		int k = 0;

		for(int i = beginIndex ; i < endIndex ; i++){
			output[k] = str.charAt(i);
			k++;
		}
		return output;
	}

	public String[] split(String str, String spliter){
		int arraySize = 1;
		String[] splittedStr = new String[arraySize];
		return splittedStr;
	}

	public int indexOf(String str, String locString){
		int index = -1;
		for(int i = 0 ; i < str.length() ; i++){
			
		}
		return index;
	}
	public char charAt(String str, int index){
		char c = '\0';
		
		char[] charArray = str.toCharArray();
		
		c = charArray[index];
		
		return c;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPractice1 strPractice1 = new StringPractice1();
		
		String testString = "Hello World. Here I am. How are you?";
		String outPutSeperator = "-------------------------------";

		//Get individual Character from String
		System.out.print("Print individual character:\n");
		for(char individualChar : testString.toCharArray()){
			System.out.print(individualChar + "-");
		}
		System.out.println("\n"+outPutSeperator);

		//Substring operations on String
		//Print substring after word Hello
		System.out.println( "substring operation with begin index:\n" + testString.substring("Hello".length()) );
		System.out.println(outPutSeperator);

		System.out.println("substring operation with begin and end index:\n"+ testString.substring( testString.indexOf("Here"), testString.indexOf("are")) );
		System.out.println(outPutSeperator);
		
		//String spliter based on delimiter
		String[] splittedStr = testString.split("\\.");
		System.out.println("String Spliter:" );
		for(String str: splittedStr){
			System.out.println(str);
		}
		System.out.println(outPutSeperator);

		//Character at index
		System.out.println("Character at 10:\n" + testString.charAt(10));
		System.out.println(outPutSeperator);
		
		//strPractice1 substring begin index function
		System.out.println("Substring on string without library function :");
		char[] subStr1 = strPractice1.subString(testString, "Hello".length() );
		
		for(int i = 0; i < subStr1.length ; i++){
			System.out.print(subStr1[i]);
		}
		System.out.println("\n"+ outPutSeperator);

		//CharAt index with out java library method
		System.out.println("CharAt on string without library function :");
		System.out.print(strPractice1.charAt(testString,10));
		System.out.println("\n"+ outPutSeperator);

		//SubString with begin and end index with out java library method
		System.out.println("substring with begin and end index without library function :");
		System.out.print(strPractice1.subString(testString,testString.indexOf("Here"), testString.indexOf("are")));
		System.out.println("\n"+ outPutSeperator);

	}

}
