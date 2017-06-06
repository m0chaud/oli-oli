package com.compit.programming.basics.sort;

import java.util.Random;

/**
 * @author: chaudharimehul
 * @date:	Jun 1, 2017
 * Not spent much time on selection sort, as time complexity is high for this algorithm compared to other sorting algorithm
 */
public class Selection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator = "------------------";
		Random random = new Random();
		int[] data = new int[10];

		System.out.println(separator);
		System.out.println("Data before sort: ");
		for(int i = 0 ; i < data.length ; i++){
			data[i] = random.nextInt(50);
			System.out.print("["+data[i]+"],");
		}
		System.out.println("\n"+separator);
		int tempData;
		int tempIndex;
		for(int i = 0 ; i < data.length ; i++){
			tempData = data[i];
			tempIndex = i;
			for(int j = i+1 ; j < data.length ; j++){
				if(tempData > data[j]){
					tempData = data[j];
					tempIndex = j;
				}
			}
			if(tempIndex != i ){
				tempData = data[i];
				data[i] = data[tempIndex];
				data[tempIndex] = tempData;
			}
		}
		System.out.println("Data after sort: ");
		System.out.println(separator);
		for(int i = 0 ; i < data.length ; i++){
			System.out.print("["+data[i]+"],");
		}
		System.out.println("\n"+separator);
	}

}
