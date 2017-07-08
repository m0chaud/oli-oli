package com.compit.programming.basics.datatype;

/**
 * @author: chaudharimehul
 * @date:	Jul 2, 2017
 * 
 */
public class NonPrimitiveDataTypeV2 {

	public static String printBinary(int k){
		String binaryR = "";
		while(k>0){
			binaryR = (k%2)+binaryR;
			k /= 2;
		}
		return binaryR;
	}
	
	public static int add(int a, int b){
		if(b == 0)
		{
			return a;
		}else{

			System.out.println(printBinary(a) + " --- " + printBinary(b));
			System.out.println(" a^b --- " + printBinary(a ^ b) );
			System.out.println(" ((a & b) << 1) --- " + printBinary((a & b) << 1) );

			return add(a ^ b , ((a & b) << 1) );
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data types
		//byte, short, int, long, float, double, boolean, char
		
		//1 digit for positive negative
		//byte 2^8 = 1 Byte = 2^7 = 128 = -128 to 127
		//short 2^16 = 2 Byte = 2^15 = -32768 to 32767
		//int 2^32 = 4 Byte = 2^31 = -2,147,483,648 to 2,147,483,647
							//479,001,600
							//6,227,020,800
							//34,071,216,128 - 2,147,483,648
		//long  2^64 = 8 Byte = 2^63 = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		//float = 4 Byte
		//double = 8 byte
		//boolean = 1 bit
		//char = 16 bit = 2 bytes = 0 to 65,536
		
		System.out.println("--------- Integer, Long Data type ---------");
		int i = 1;
		long l = 1;
		
		for(int z = 1 ; z < 30; z++){
			i = i * z; // n factorial
			l = l * z;
			//System.out.println("Factorial for " + i + " --- int factorial " + n + " ---- long factorial -- " + l);
			System.out.printf("Factorial for %2d --- int factorial %11d ---- long factorial -- %30d \n", z ,i , l);
		}

		System.out.println("\n --------- Byte, Short Data type ---------");
		
		byte b = 1;
		short s = 1;
		
		for(short z = 1 ; z < 10 ; z++){
			//
			b = (byte) (b * z);
			s = (short) (s * z);
			
			System.out.printf("Factorial for %2d --- byte factorial %10d --- short factorial %10d \n",i, b, s);
			
		}
		
		System.out.println(" ----------- bit operations ---------------- ");
		
		int bitExp = 18;
		int bitExpPlaceHolder = bitExp;
		System.out.printf( " Binary representation of %5d ---- %s \n",bitExp, printBinary(bitExp) );
		
		System.out.println(" shift left by 1 location i << 1 --- " + printBinary(bitExp << 1) + " --- "  + (bitExp << 1) );
		System.out.println(" shift right by 1 location i >> 1 --- " + printBinary(bitExp >> 1) + " ---- " + (bitExp >> 1) );
		
		int cnt = 0;
		while(bitExpPlaceHolder > 0){
			bitExpPlaceHolder = bitExpPlaceHolder >> 1;
			cnt++;
		}
		System.out.println(" 2 power within for " + bitExp  + " --- " + cnt);

		System.out.println(" ----------- bit operations - addition ---------------- ");		
		
		System.out.println(" Recursive method for bit wise addition : " + add(bitExp, bitExp-8));

		int x1 = 104;
		int y1 = 105;
		
		int carry;
		
		while(x1 != 0 ){
		
			carry = ( x1 & y1 ) << 1;
		
			y1 = x1 ^ y1;
			
			x1 = carry;
		}
		
		System.out.println(" while loop for bitwise addition : "+ y1);		

		System.out.println(" ----------- bit operations - multiplication ---------------- ");
		
		int x2 = 15;
		int y2 = 50;
		int result = 0;
		while(y2 > 0){
		
			if( (y2 & 1) == 1 ){
				result += x2;
			}	
			
			x2<<=1;
			y2>>=1;
		}
		System.out.println(" Bit wise multiplication ------- " + result );
		
		System.out.println(" ----------- bit operations - subtruction ---------------- ");
		
		int x3 = 15;
		int y3 = 5;
		
		int borrow;
		while(y3 != 0){
			
			borrow = ((~x3) & y3) << 1;
			
			x3 = x3 ^ y3;
			
			y3 = borrow;
		}
		System.out.println(" while loop for bitwise addition : "+ x3);
	}
}
