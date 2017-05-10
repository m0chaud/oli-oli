package com.compit.programming.basics.DataType;

import java.util.ArrayList;

/**
 * @author: chaudharimehul
 * @date:	May 9, 2017
 * 
 */
public class ArrayListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printStrPreSuffix = "--------------------";
		System.out.println(printStrPreSuffix +" ArrayList without dataType "+ printStrPreSuffix);
		//Array List initialized without data type
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add("First");
		arrayList1.add("Second");
		arrayList1.add("Third");

		//Array List for loop
		for(int i = 0 ; i < arrayList1.size() ; i++){
			System.out.println(arrayList1.get(i));
		}

		//Array List initialized with Data type
		System.out.println(printStrPreSuffix +" ArrayList multiple Operations "+ printStrPreSuffix);
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("First");
		arrayList2.add("Second");
		arrayList2.add("Third");
		arrayList2.add("Fourth");

		//ArrayList for loop iterator
		for (String string : arrayList2) {
			System.out.println(string);
		}

		//Contains operation
		System.out.println(printStrPreSuffix +" Array List contains operation --- " + arrayList2.contains("First"));

		//Index of operation
		System.out.println(printStrPreSuffix +" Array List Index of operation --- "+arrayList2.indexOf("Second"));

		System.out.println(printStrPreSuffix +" Add All " + printStrPreSuffix );

		//addAll operation
		arrayList2.addAll(arrayList1);
		for(String str : arrayList2){
			System.out.println(str);
		}
	}
}
