package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	May 28, 2017
 * 
 */
public class Stackv2<T> {

	GenericNode<T> topNode;
	
	public Stackv2(){
		
	}
	
	public boolean isEmpty(){
		if(null == topNode)
			return true;
		return false;
	}
	public void push(T data){
		GenericNode<T> node = new GenericNode<T>(data);
		
		if(isEmpty())
		{
			topNode = node;
		}else{
			node.setNext(topNode);
			topNode = node;
		}
	}
	
	public void pop(){
		
	}
	
	public void peek(){
		
	}
	
	public void travese(){
		GenericNode<T> currentNode = topNode;
		
		while(null != currentNode){
			System.out.print(currentNode.getData() + " --> " );
			currentNode = currentNode.getNext();
		}
		System.out.println("");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackv2<Integer> sInt = new Stackv2<Integer>();
		sInt.push(1);
		sInt.push(2);
		sInt.push(10);
		sInt.push(20);
		
		sInt.travese();
		
		Stackv2<String> sString = new Stackv2<String>();
		sString.push("First");
		sString.push("Second");
		sString.push("Random");
		sString.push("Last");
		
		sString.travese();
	}

}
