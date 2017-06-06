package com.compit.programming.basics.sort;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author: chaudharimehul
 * @date:	Jun 1, 2017
 * Merge sort
 * 
 */
public class Merge {

	public static void sort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		int middle = (left+right)/2;
		sort(array, left, middle); // Sort left array
		sort(array, middle+1,right); // Sort right array
		merge(array, left,middle, right); //Merge left and right array
	}
	
	public static void merge(int[] array, int left, int middle, int right){
		int i = left;
		int j = middle+1;
		int k = 0;
		int[] temp = new int[right - left + 1];

		while(i <= middle && j <= right){
			if(array[i] <= array[j]){
				temp[k] = array[i];
				i++;
			}else{ // array[j] < array[i]
				temp[k] = array[j];
				j++;
			}
			k++;
		}
		
		if(i <= middle){
			while(i <= middle){
				temp[k] = array[i];
				i++;
				k++;
			}
		}
		if(j <= right){
			while(j <= right){
				temp[k] = array[j];
				j++;
				k++;
			}
		}
		for(i = 0 ; i < temp.length ; i++){
			array[left+i] = temp[i];
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String separator = "------------------";
		int maxArraySize = 1000000;
		int[] array = new int[maxArraySize];
		String fileName = "mergerSortValue_"+new SimpleDateFormat("yyyy-MM-dd").format(new Date())+".txt";
		FileWriter fwr;
		BufferedWriter bfw;
		System.out.println(separator);
		for(int i = 0 ; i < array.length ; i++){
			array[i] = random.nextInt(maxArraySize);
			//System.out.print("["+array[i]+"],");
		}
		System.out.println("Merge sort the data: ");
		long startTime = System.currentTimeMillis();
		sort(array, 0, array.length-1);
		System.out.println("Time taken to merge sort: " + (System.currentTimeMillis() - startTime));
		try{
			fwr = new FileWriter(fileName);
			bfw = new BufferedWriter(fwr);
			
			for(int i = 0; i < array.length; i++){
				bfw.write("["+array[i]+"],");
			}
			
			bfw.write("\n");
			
			bfw.close();
			fwr.close();
			
		}catch(Exception e){
		}
		System.out.println("\n" + separator);
	}

}
