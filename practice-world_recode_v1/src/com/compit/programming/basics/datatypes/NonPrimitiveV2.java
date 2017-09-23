package com.compit.programming.basics.datatypes;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.SortedMap;

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

	public First(){
		super();
	}

	public First(String valueOf){
		super(valueOf);
	}
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
	private static final Logger logger = Logger.getLogger(NonPrimitiveV2.class.getName());		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer, List<Integer>> intMap = new HashMap<Integer, List<Integer>>();

		//------------------------------------------- 1 -------------------------------------------//
		List<String> str = new ArrayList<String>();

		str.add("first");
		str.add("second");

		str.set(0,"changed First");
		str.add(2,"add at specific index");
		str.add("this will be removed");
		str.remove(3);
		str.add("second");

		logger.info("String arrayList size :- "+ str.size());
		logger.info("String arrayList isEmpty :- "+ str.isEmpty());
		logger.info("String arrayList indexOf :- "+ str.indexOf("second"));
		logger.info("String arrayList get :- "+ str.get(2));

		List<First> first = new ArrayList<First>();

		first.add(new First());
		first.add(new First("Sample"));

		for(String string: str){
			System.out.println(" String object arraylist :- " + string);
		}

		for(First f: first){
			System.out.println(" Custom object arrayList :- " + f.getString());
		}

		List<List<List<String>>> listStr = new ArrayList<List<List<String>>>();

		//------------------------------------------- 1 -------------------------------------------//
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(" Stack peek " + stack.peek());
		System.out.println(" Stack pop " + stack.pop());
		System.out.println(" Stack push " + stack.push(4));
		System.out.println(" Stack empty " + stack.empty());


		//------------------------------------------- 1 -------------------------------------------//
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("1");
		linkedList.push("10");

		Random linkedListRandom = new Random();
		for(int i = 0 ; i < 10; i++){
			//Random
			linkedList.add(""+linkedListRandom.nextInt(50));
		}

		ListIterator<String> ltr =  linkedList.listIterator();

		while(ltr.hasNext()){
			System.out.print(" --> " + ltr.next() );
		}
		System.out.println(" java 8 - Method preference linkedList iterator ");

		linkedList.forEach(System.out::print);

		System.out.println("\n java 8 - lambda linkedList iterator ");
		linkedList.forEach( ll1 -> System.out.print( " --> " + ll1) );

		System.out.println("");

		linkedList.forEach(ll1 -> 
		{
			if(ll1 == "10")
			{ System.out.println(ll1);}
		}
				);

		System.out.println(" java 8 - Stream and filter - linkedList iterator ");

		linkedList.stream()
		.filter(ll1 -> (Integer.valueOf(ll1) > 10))
		.forEach(ll1 -> System.out.print(" --> " +ll1) );

		System.out.println("");
		
		
		
		//------------------------------------------- 1 -------------------------------------------//
		Queue<String> queue1 = new PriorityQueue<String>();
		Queue<String> queue2 = new LinkedList<String>(); //For Double, single queue
		
		//
		Random queueRandom = new Random();
		int random = 50;
		for(int i = 0 ; i < 5 ; i++){
			queue1.add(""+queueRandom.nextInt(random));
			queue2.add(""+queueRandom.nextInt(random));	
		}
		
		System.out.println("");
		queue1.forEach(System.out::print);
		System.out.println("");
		
		queue2.forEach(ll1 -> System.out.print("-->" + ll1));
		
		System.out.println("");
		
		queue1.stream()
			   .filter(ll1 -> Integer.valueOf(ll1) > 20)
			   .forEach(ll1 -> System.out.print(" --> " + ll1));
			   
		System.out.println("");
		
		
		//------------------------------------------- 1 -------------------------------------------//
		//Map, HashMap
		Map<Integer, String > map = new HashMap<Integer, String>();
		
		SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		Set<String> set = new HashSet<String>();
		
		Random random1 = new Random();
		int random1Count = 100;
		for(int i = 0 ; i < 5 ; i++){
			map.put( random1.nextInt(random1Count),""+random1.nextInt(random1Count) );
			treeMap.put( random1.nextInt(random1Count),""+random1.nextInt(random1Count) );
			set.add( ""+random1.nextInt(random1Count) );
		}
		
		System.out.print("regular map with Map.Entry iterator");
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(" key " + entry.getKey() + " --> value " + entry.getValue() );
		}
		
		System.out.println("treeMap, SortedMap with Lambda expression iterator");
		
		treeMap.forEach( (i,j) -> System.out.println(" key " + i + " --> value " + j ) );
		
		System.out.print(" regular for loop for Set iteration ");
		
		for(String str1 : set){
			System.out.print( "-->" + str1);
		}
		
		System.out.println("");
		
		Map<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		
		linkedHashMap.put("1","1");
		linkedHashMap.put("3","3");
		linkedHashMap.put("2","2");
		
		System.out.println(" linkedHashMap Keyset --> : "+ linkedHashMap.keySet());
		System.out.println(" linkedHashMap valueSet --> : "+ linkedHashMap.values());
		
		System.out.println(" LinkedHashSet Lambda print ");
		linkedHashMap.forEach( (i,j) -> System.out.println( "key : " + i + " value: " + j));
		
		System.out.println("");
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		Random r = new Random();
		
		for(int i = 0 ; i < 10 ; i++){
			treeSet.add(r.nextInt(50));
		}
		
		System.out.println(" Lambda expression print for treeSet ");
		
		treeSet.forEach(ll1 -> System.out.println(" treeSet Value: " + ll1));
		
		System.out.println("");
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		for(int i = 0 ; i < 10 ; i++){
			linkedHashSet.add(r.nextInt(100));
		}
		
		System.out.println(" Lambda Print for linkedHashSet ");
		
		linkedHashSet.forEach( ll1 -> System.out.println( "linkedHashSet value: " + ll1 ) );
		
		System.out.println("");
	}

}
