package com.compit.programming.basics.datatypes;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;

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

		//----- List ----//
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
		//----- Stack ----//
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(" Stack peek " + stack.peek());
		System.out.println(" Stack pop " + stack.pop());
		System.out.println(" Stack push " + stack.push(4));
		System.out.println(" Stack empty " + stack.empty());

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

	}

}
