/**
 * 
 */
package com.org.personaldev.firstpkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author chaudharimehul
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		System.out.println("HelloWorld");
		System.out.println(Integer.MIN_VALUE);

		String inputStrs[] = new String[10];
		 */
		// Print triangle from #, use of %ns white space
		int n = 6;
		String printStr = "#";
		 for(int i = 0 ; i < n ; i++ ){
			 String whiteStr = n +"s";
			 System.out.printf("%"+whiteStr,printStr);
			 System.out.println("");
			 printStr = printStr + "#";
		 }
		 
		 String subStr = "abc";
		 System.out.println(subStr.substring(0, 0) + " ---" + subStr.substring(1));
		 System.out.println(subStr.substring(0, 1) + " ---" + subStr.substring(2));
		 System.out.println(subStr.charAt(0));
		 System.out.println(subStr.length());
		 
		 //ConcurrentHashMap<K, V>
		 //Hashtable<K, V>
		 //CopyOnWriteArrayList<E>
		 ArrayList<String> s = new ArrayList<String>();
		 HashMap<String, String> s2 = new HashMap<String, String>();
		 HashSet<String> s3 = new HashSet<String>();
		 
		 int[] singleDim = new int[3];
		 singleDim[0] = 0;
		 singleDim[1] = 1;
		 singleDim[2] = 2;
		 
		 
		 
		 int[] singleDim2 = {1,2,3};
		 System.out.println("singleDim2 length --- " +  singleDim2.length);
		 
		 int[][] twoDim = new int[2][3];
		 
		 twoDim[0][0] = 00;
		 twoDim[0][1] = 01;
		 twoDim[0][2] = 02;
		 twoDim[1][0] = 10;
		 twoDim[1][1] = 11;
		 twoDim[1][2] = 12;
		 
		 int[][] twoDim2 = {{00,01,02},{10,11,12}};
		 System.out.println("twoDim2 --- " + twoDim2.length);

		 
/*			 
		 System.out.println(" character " + ch1 + " --- chIndex " + chIndex);

		 if(str1.charAt(i) == ' ' ){
			 System.out.println(" White space encountered");
		 }
*/			 
		 String str1 = "Hello World";
		 
		 char[] alphabet = new char[26];
		 char ch1;
		 int chIndex;
		 
		 for(int i = 0; i < str1.length() ; i++ ){
			 
			 ch1 = (char) ( (str1.charAt(i) < 97)?str1.charAt(i)+32:str1.charAt(i) );
			 chIndex = ch1-97;

			 if(chIndex < 0 || chIndex > 26){
				 System.out.println("Special character encountered " + ch1);
				 continue;
			 }
			 
			 if(alphabet[chIndex] != '\0' ){
				 System.out.println("repeated char " + alphabet[chIndex]);
				 break;
			 }else{
				 alphabet[chIndex] = ch1;
			 }
		 }
	}
}
