package com.compit.programming.basics.sorting;

import java.util.Arrays;
/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class QuickSort {

	public static void sort(int[] array, int firstIndex, int lastIndex){
		if( firstIndex >= lastIndex){
			return;
		}

		int partitionIndex = partition(array, firstIndex, lastIndex);

		sort(array, firstIndex, partitionIndex-1);
		sort(array, partitionIndex+1, lastIndex);
	}

	public static int partition(int[] array, int firstIndex, int lastIndex){

		int pivot = array[lastIndex];
		int newLastIndex = lastIndex - 1;
		int temp;

		while(firstIndex <= newLastIndex){
			if(array[firstIndex] < pivot){
				firstIndex++;
			}else if(array[newLastIndex] > pivot){
				newLastIndex--;
			}else{
				temp = array[newLastIndex];
				array[newLastIndex] = array[firstIndex];
				array[firstIndex] = temp;
				firstIndex++;
			}
		}
		temp = array[lastIndex];
		array[lastIndex] = array[firstIndex];
		array[firstIndex] = temp;
		return firstIndex;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,8,7,6,5,4,3,2,1};
		sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));

		int[] array2 = {9,0,8,-1,7,6,5,5,5,4,3,2,1,10};
		sort(array2, 0, array2.length-1);
		System.out.println(Arrays.toString(array2));
	}

}
