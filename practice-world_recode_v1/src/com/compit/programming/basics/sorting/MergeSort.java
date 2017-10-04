package com.compit.programming.basics.sorting;

import java.util.Arrays;
/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class MergeSort {

	public int[] mergeSort(int[] array){
	
		if( array.length <=1)
			return array;
			
		int middle = (array.length)/2;
		
		int[] leftArray = Arrays.copyOfRange(array, 0 ,middle);
		int[] rightArray = Arrays.copyOfRange(array,middle, array.length);
		
		int[] dividedLeftArray = mergeSort(leftArray);
		int[] dividedRightArray = mergeSort(rightArray);
		
		int[] sortedArray = merge(dividedLeftArray, dividedRightArray);

		return sortedArray;	
	}
	
	public int[] merge(int[] leftArray, int[] rightArray){
		int[] mergedSortedArray = new int[leftArray.length + rightArray.length];
		
		System.out.println("Left Array -> "+ Arrays.toString(leftArray));
		System.out.println("Right Array -> "+ Arrays.toString(rightArray));		
		
		int k = 0;
		int i = 0;
		int j = 0;
		while(k < leftArray.length || k < rightArray.length){
		
			if(leftArray[i] < rightArray[j]){
				mergedSortedArray[k] = leftArray[i];
				i++;
			}else{
				mergedSortedArray[k] = rightArray[j];
				j++;
			}
			
			k++;
		}
		
		while( i < leftArray.length){
			mergedSortedArray[k] = leftArray[i];
			i++;
			k++;
		}	

		while( j < rightArray.length){
			mergedSortedArray[k] = rightArray[j];
			k++;
			j++;
		}	

		return mergedSortedArray;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {6,5,4,7,3,2,1};
		MergeSort mSort = new MergeSort();
		
		int[] sortedArray = mSort.mergeSort(array);
		
		System.out.println(Arrays.toString(sortedArray));

	}

}
