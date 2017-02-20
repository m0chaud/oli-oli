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
		 */	String printStr = "#";
		 for(int i = 0 ; i < 6 ; i++ ){
			 String whiteStr = (6-i) +"s";
			 System.out.printf("%"+whiteStr+"\n",printStr);
			 printStr = printStr + "#";
		 }
	}
}
