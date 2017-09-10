package com.compit.programming.basics.datatypes;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author: chaudharimehul
 * @date:	Sep 9, 2017
 * 
 */
public class NonPrimitiveDataType {

	private static final Logger logger = Logger.getLogger( NonPrimitiveDataType.class.getName() );
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTimeProgram = System.currentTimeMillis();
		Byte b = 100;

		System.out.printf(" String value %s \n" , b.toString());
		System.out.printf(" integer value intValue() %d --- Integer.valueOf() %d \n", b.intValue(), Integer.valueOf(b));
		System.out.printf(" short value shortValue() %d --- Short.valueOf() %d \n", b.shortValue(), Short.valueOf(b));
		System.out.printf(" long value longValue() %d --- Long.valueOf() %d \n", b.longValue(), Long.valueOf(b));	

		logger.info(" String value " + b.toString());
		logger.warning(" integer value intValue() %d "+ b.intValue() +" --- Integer.valueOf() %d" + Integer.valueOf(b));
		logger.log(Level.SEVERE, " short value shortValue() "+ b.shortValue() +" --- Short.valueOf()" + Short.valueOf(b));
		logger.log(Level.WARNING, " long value longValue() %d "+ b.longValue() +" --- Long.valueOf() %d" + Long.valueOf(b));	

		//String
		//StringBuffer
		//StringBuilder
		//Two Dimensional array
		//Three Dimensional array
		//System.currentMilliseconds()

		int nCount = 9000000;
		StringBuffer strBuffer = new StringBuffer();
		StringBuilder strBuilder = new StringBuilder();

		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < nCount ; i++){
			strBuffer.append(""+i);
		}
		logger.info("Time taken to add "+ nCount + " values to string buffer " + (System.currentTimeMillis() - startTime) );

		// String builder is comparatively faster for large size input
		startTime = System.currentTimeMillis();
		for(int i = 0 ; i < nCount ; i++){
			strBuilder.append(""+i);
		}
		logger.info("Time taken to add "+ nCount + " values to string builder " + (System.currentTimeMillis() - startTime) );

		String str = "Today is Staurday";
		System.out.printf("printing charcter from length - 5 -- %c -- \n", str.charAt(str.length()-5) );
		System.out.printf("printing charcter at 5 -- %c --\n", str.charAt(4) );

		System.out.printf("substring -- %s\n" , str.substring(5, str.length()-5) );

		for(int i = 0 ; i < str.length() ; i ++){
			if((int)str.charAt(i) < 95){
				System.out.printf("%c", str.charAt(i));
			}else{
				System.out.printf("%c", str.charAt(i)-32);
			}
		}
		System.out.println("");
		for(int i = 0 ; i < str.length() ; i ++){
			if((int)str.charAt(i) < 95){
				System.out.printf("%c", str.charAt(i)+32);
			}else{
				System.out.printf("%c", str.charAt(i));
			}
		}

		System.out.println("");

		System.out.println("Time  taken to execute complete program - " + (System.currentTimeMillis() - startTimeProgram));

		int[] oneDI = {1,2,3,4,5};
		int[] oneD = new int[5];
		for(int i = 0 ; i < 5 ; i++){
			oneD[i] = i+5;
			System.out.println("singleI " + oneDI[i] + "   - single " + oneD[i]);			
		}

		int[][] twoDI = {{1,2},{3,4},{5,6},{7,8}};
		int[][] twoD = new int[4][2];
		
		System.out.println(" Two dimensional array ");
		System.out.print("{");
		for(int i = 0 ; i < twoDI.length ; i ++){
			System.out.print("{");
			for(int j = 0 ; j < twoDI[i].length ; j++){
				System.out.print(twoDI[i][j]);

				if(j < (twoDI[i].length-1)){
					System.out.print(",");
				}

			}
			System.out.print("}");

			if(i < (twoDI.length-1)){
				System.out.print(",");
			}
		}
		System.out.println("}");

		int z = 10;
		System.out.print("{");
		for(int i = 0 ; i < twoD.length ; i ++){
			System.out.print("{");
			for(int j = 0 ; j < twoD[i].length ; j++){
				twoD[i][j] = z; 
				System.out.print(twoD[i][j]);
				z++;

				if(j < (twoD[i].length-1)){
					System.out.print(",");
				}

			}
			System.out.print("}");

			if(i < (twoD.length-1)){
				System.out.print(",");
			}
		}
		System.out.println("}");

		System.out.println(" Three dimensional array ");
		int[][][] threeDI = { {{1},{2}} ,{{3},{4}} ,{{5},{6}} ,{{7},{8}} };
		int[][][] threeD = new int[4][2][1];

		System.out.print("{");
		for(int i = 0 ; i < threeDI.length ; i++){
			System.out.print("{");
			for(int j = 0 ; j < threeDI[i].length ; j++){
				System.out.print("{");
				for(int k = 0 ; k < threeDI[i][j].length ; k++){
					System.out.print(threeDI[i][j][k]);
					
					if( k < (threeDI[i][j].length-1) ){
						System.out.print(",");
					}
				}
				
				System.out.print("}");
				
				if(j < (threeDI[i].length-1) ){
					System.out.print(",");
				}
			}
			
			System.out.print("}");
			if( i < (threeDI.length -1) ){
				System.out.print(",");
			}
		}

		System.out.println("}");
		
	}
}
