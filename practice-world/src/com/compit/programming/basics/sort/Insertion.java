package com.compit.programming.basics.sort;

import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: chaudharimehul
 * @date:	Jun 1, 2017
 * 
 */
public class Insertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = new int[1000000];
		Random random = new Random();
		int tempSwap;

		String fileName = "insertionSortedValue_"+new SimpleDateFormat("yyyy-MM-dd").format(new Date())+".txt";
		FileWriter fwr = null;
		BufferedWriter bfw = null;

		//System.out.println("Array before insertion sort: ");
		for(int i = 0 ; i < unsortedArray.length ; i++){
			unsortedArray[i] = random.nextInt(1000000);
			//System.out.print("[" + unsortedArray[i]  + "],");
		}

		long startTime = System.currentTimeMillis();

		for(int i = 0 ; i < unsortedArray.length-1 ; i++){
			if( unsortedArray[i] > unsortedArray[i+1] ){
				tempSwap = unsortedArray[i];
				unsortedArray[i] = unsortedArray[i+1];
				unsortedArray[i+1] = tempSwap;

				for(int j = i ; j > 0 ; j--){
					if(unsortedArray[j-1] > unsortedArray[j]){
						tempSwap = unsortedArray[j-1];
						unsortedArray[j-1] = unsortedArray[j];
						unsortedArray[j] = tempSwap;
					}
				}
			}
		}

		System.out.println("Time taken to insertion sort array: " + ( System.currentTimeMillis() - startTime ) );

		//System.out.println("\nArray after insertion sort:");
		try{
			fwr = new FileWriter(fileName);
			bfw = new BufferedWriter(fwr);

			for(int i = 0 ; i < unsortedArray.length ; i++){
				bfw.write("[" + unsortedArray[i] + "],");
			}
			bfw.write("\n");
			bfw.close();
			fwr.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
