package com.org.personaldev.DataType;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: chaudharimehul
 * @date:	May 9, 2017
 * 
 */
public class HashSetImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printStrPreSuffix = "--------------------";
		System.out.println(printStrPreSuffix + " Hashset operations ");
		Set set1 = new HashSet();
		set1.add(1);
		set1.add(100);
		set1.add(1000);
		
		System.out.println(printStrPreSuffix +  " for loop iterator ");
		for(Object value : set1){
			System.out.println(value);
		}
	
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(10000);
		set2.add(100000);
		set2.add(1000000);
		
		System.out.println(printStrPreSuffix + " Additional methods on hash set ");
		System.out.println(" contains method on hashSet --- "+  set2.contains(10000) );
		set2.remove(100000);
		System.out.println(" Removed value from Set (Similar to ArrayList) "+ set2);
	}

}
