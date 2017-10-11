package com.compit.programming.basics.additional;

/**
 * @author: chaudharimehul
 * @date:	Oct 10, 2017
 * 
 */
public class PascalTriangle {

	public void printPascalTriangle(int []raw, int numOfRaws){

		if(raw.length + 1 > numOfRaws ){
			return;		
		}

		int i = 0;
		int[] newRaw = new int[raw.length + 1];
		newRaw[i] = raw[i];
		for(i = 0 ; i < raw.length-1; i++){
			newRaw[i+1] = raw[i] + raw[i+1];
		}
		newRaw[i+1] = raw[i];
		
		for(int j = 0 ; j < newRaw.length ; j++){
			System.out.print( newRaw[j] + " ");
		}
		System.out.println("");
		printPascalTriangle(newRaw, numOfRaws);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		
		int[] raw = {1, 1};
		
		for(int i = 0 ; i < raw.length ; i++){
			System.out.print(raw[i]+" ");
		}
		
		System.out.println("");
		
		PascalTriangle p = new PascalTriangle();
		
		p.printPascalTriangle(raw,10);
	}

}
