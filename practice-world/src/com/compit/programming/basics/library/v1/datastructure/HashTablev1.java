package com.compit.programming.basics.library.v1.datastructure;

import java.util.Arrays;

/**
 * @author: chaudharimehul
 * @date:	May 10, 2017
 * Hashtable
 * - Version 1
 * - Collision is not taken care
 * - Works on String key, String Value
 */
public class HashTablev1 {

	int indexMode = 10;
	String[] data = new String[indexMode];

	public void put(String key, String value){
		int hashCode = getHashCode(key);
		int index = getIndex(hashCode);

		data[index] = value;
	}

	public String get(String key){
		String value = null;
		int hashCode = getHashCode(key);
		int index = getIndex(hashCode);

		if(data[index] != null){
			value = data[index];
		}

		return value;
	}

	//Return sum of the string character
	private int getHashCode(String key){
		int hashCode = 0;

		for(int i = 0; i < key.length(); i++){
			hashCode += key.charAt(i);
		}

		return hashCode;
	}

	private int getIndex(int hashCode){
		return (hashCode % indexMode);
	}

	public void printHashTable(){
		for(int i = 0 ; i < data.length ; i++){
			System.out.println(data[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTablev1 hashtable = new HashTablev1();

		hashtable.put("Mehul", "Mehul");
		hashtable.put("Kamini", "Kamini Chaudhari");
		hashtable.put("lMehu", "Mehul");
		hashtable.put("Aarav", "Aarav Chaudhari");
		hashtable.put("Facebook", "Facebook");

		hashtable.printHashTable();

		System.out.println("Value for key Mehul --> "+ hashtable.get("Mehul"));
		System.out.println("Value for key lMehu --> "+hashtable.get("lMehu"));
		System.out.println("Value for key Facebook --> "+hashtable.get("Facebook"));
	}

}
