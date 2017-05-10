package com.org.personaldev.DataType;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author: chaudharimehul
 * @date:	May 9, 2017
 * 
 */
public class HashMapImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printStrPreSuffix = "--------------------";
		System.out.println(printStrPreSuffix+" HashMap Operations "+printStrPreSuffix);
		
		//Map without data Types
		Map hashMap1 = new HashMap();
		hashMap1.put("1", "one");
		hashMap1.put("2", "two");
		hashMap1.put("9", "nine");
		
		for (Object mapEntry : hashMap1.entrySet()) {
			System.out.println( ((Entry)mapEntry).getKey() + " -- " + ((Entry)mapEntry).getValue());
		}
		
		//Map with specific data types
		System.out.println(printStrPreSuffix + " EnterySet Iterator ");
		Map<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("1", "one");
		hashMap2.put("2", "two");
		hashMap2.put("8", "eight");
		//Map iterator using entryset
		for(Entry<String,String> entry: hashMap2.entrySet()){
			System.out.println(entry.getKey() + " --- " + entry.getValue());
		}
		
		//Map iterator using key set
		System.out.println(printStrPreSuffix + " keyset iterator ");
		Map<Integer, String> hashMap3 = new HashMap<Integer, String>();
		hashMap3.put(1, "one");
		hashMap3.put(2, "two");
		hashMap3.put(8, "eight");
	
		for(Integer key: hashMap3.keySet()){
			System.out.println(key + " --- " + hashMap3.get(key));
		}
		
		System.out.println(printStrPreSuffix + " Value iterator");
		//Map iterator using 
		for(String value : hashMap3.values()){
			System.out.println(value);
		}
	}
}
