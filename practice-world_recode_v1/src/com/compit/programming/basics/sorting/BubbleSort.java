package com.compit.programming.basics.sorting;

import java.util.Random;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class BubbleSort {

	private static int size = 10;

	public void print(int[] array){

		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + " --> ");		
		}
		System.out.println("");
	}

	public void bubbleSort(int[] array){

		int temp;

		boolean ifValueExchanged = false;

		for(int i = 0 ; i < array.length ; i++){
			ifValueExchanged = false;
			
			for(int j = 0 ; j < (array.length - 1) ; j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					ifValueExchanged = true;
				}
			}
			
			if(!ifValueExchanged){
				System.out.println(" number of iteration for sorting " + i);
				break;
			}
		}

		print(array);		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();

		Random random = new Random();

		int[] array = new int[size];

		for(int i = 0 ; i < size ; i++){
			array[i] = random.nextInt(400);
		}

		bubbleSort.print(array);
		System.out.println("After bubble Sorting");
		bubbleSort.bubbleSort(array);
	}

}
