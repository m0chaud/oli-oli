package com.compit.programming.basics.datatypes;

import java.util.List;
import java.util.ArrayList;

class Basic{
	String valueOf;
	
	public Basic(){
		this.valueOf = "defaultValue";
	}
	
	public Basic(String valueOf){
		this.valueOf = valueOf;
	}
	
	public String getValueOf(){
		return this.valueOf;
	}
}

class First extends Basic{

	
	public String getString(){
		return "From First -- " + getValueOf();
	}
}

class Second extends Basic{

	public String getString(){
		return "From Second -- " + getValueOf();
	}
}

/**
 * @author: chaudharimehul
 * @date:	Sep 10, 2017
 * 
 */
public class NonPrimitiveV2 {
	//List
		//ArrayList, List
		//Stack
		//LinkedList
		//Queue
		//DQueue
	//Dictionary/Map
		//Map, HashMap
		//LinkedHashMap
		//TreeMap
		//SortedMap
	//Set
		//Set, HashSet
		//TreeSet
		//LinkedHashSet
	//For Multi-threaded environment - to handle concurrancy
		//ConcurrentHashMap
		//SynchronizedList
		//CopyOnArrayList
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer, List<Integer>> intMap = new HashMap<Integer, List<Integer>>();
		
		List<? extends Basic> list1 = new ArrayList<>();
		
	}

}
