package com.compit.programming.basics.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chaudharimehul
 * @date:	May 9, 2017
 * 
 */
public class ListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List Data Type
		//List is an interface can not be initialized
		//List vs ArrayList
		//http://stackoverflow.com/questions/2279030/type-list-vs-type-arraylist-in-java
		//http://docs.oracle.com/javase/tutorial/collections/implementations/list.html
		//List is preferred
		//ArrayList.subList returns the list
		//Arrays.asList returns list
		//
		String printStrPreSuffix = "--------------------";		
		System.out.println(printStrPreSuffix +" List  Operations "+ printStrPreSuffix);
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");

		list1.remove(0);
		System.out.println(printStrPreSuffix + " Removal of field from list ");
		
		//List iterator, shorten form of for loop can be used for Array, ArrayList, List
		for(String str : list1){
			System.out.println( str);
		}
		
		System.out.println(printStrPreSuffix + " Array to List " );
		Integer[] arrayToListExample = {1,2,3,4,5};
		//Generic Does not support primitive data types
		//List<int> list2 = new ArrayList<int>();
		List<Integer> list2 = Arrays.asList(arrayToListExample);
		for(Integer i : list2){
			System.out.print(" --- " + i + " --- ");
		}
	}

}
