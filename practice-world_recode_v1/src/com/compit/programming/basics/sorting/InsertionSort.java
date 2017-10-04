package com.compit.programming.basics.sorting;

import java.util.Random;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class InsertionSort {

	private static int size = 10;
	
	//private static int size = 100000;
	
	public void insertionSort(int[] array){
		int temp;
		for(int i = 0 ; i < array.length ; i++){
			for(int j = i ; j > 0 ; j-- ){
				if(array[j-1] > array[j]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}	
		}
		
		print(array);
	}
	
	//Modified version of insertion Sort
	//Perform replacement only once
	public void insertionSortv2(int[] array){
		int temp;
		int replacementIndex = 0;
		for(int i = 0 ; i < array.length ; i++){
			replacementIndex = i;
			for(int j = i ; j > 0 ; j-- ){
			
				if(array[j-1] > array[i]){
					replacementIndex = j-1; 
				}
				
			}
			if(replacementIndex < i){
				temp = array[i];
				array[i] = array[replacementIndex];
				array[replacementIndex] = temp;
			}
		}
		
		print(array);
	}
		
	public void print(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + " --> ");
		}
		System.out.println("");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort is = new InsertionSort();
		Random random = new Random();
		int[] array = new int[size];
		long start;
		
		for(int i = 0 ; i < size ; i++){
			array[i] = random.nextInt(200);
		}
	
		is.print(array);
		System.out.println(" after insertion sort ");
		
		start = System.currentTimeMillis();
		is.insertionSort(array);
		System.out.println(System.currentTimeMillis() - start);
		
		
		System.out.println(" after insertion sort v2 ");
		start = System.currentTimeMillis();
		is.insertionSortv2(array);
		System.out.println(System.currentTimeMillis() - start);

	}

}
