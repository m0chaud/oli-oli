/**
 * 
 */
package com.org.personaldev.firstpkg;

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
		 
	}
}
