package com.compit.programming.basics.datastructure.questack;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 28, 2017
 * Stack v2 with generics
 * For generic String dataType is used for this implementation
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
			setTopNode(node);
		}
	}
	
	public T pop(){
		
		T data = null;
		
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			data = getTopNode().getData();
			setTopNode(getTopNode().getNext());
		}
		
		return data;
	}
	
	public T peek(){
		
		T data = null;

		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			
			data = getTopNode().getData();
		}
		
		return data;
	}
	
	public void traverse(){
		GenericNode<T> currentNode = topNode;
		
		while(null != currentNode){
			System.out.print(currentNode.getData() + " --> " );
			currentNode = currentNode.getNext();
		}
		System.out.println("");
	}
	
	public GenericNode<T> getTopNode(){
		return topNode;
	}
	
	public void setTopNode(GenericNode<T> topNode){
		this.topNode = topNode;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Stackv2<String> stackv2 = new Stackv2<String>();
		String nodeData = new String();
		
		System.out.println("Select below option to perform operation on Stack");
		System.out.println("1. Add node into stack. Enter 'done' to stop entering the value");
		System.out.println("2. Pop node from the stack");
		System.out.println("3. Peek node from the stack");
		System.out.println("4. Traverse stack");
		System.out.println("5. Exit");
		
		int choice;
		String data;
		boolean bExit = false;
		while(!bExit){
			choice = in.nextInt();
			switch(choice){
			case 1:
					System.out.println("Enter stack node values");
					data = null;
					data = in.next();
					while(!"done".equalsIgnoreCase(data)){
						System.out.println("Data push to stack " + data);
						stackv2.push(data);
						data = in.next();
					}
					stackv2.traverse();
				break;
			case 2:
				nodeData = stackv2.pop();
				if(null != nodeData)
					System.out.println("Node removed from the stack " + nodeData );
				stackv2.traverse();
				break;
			case 3:
				nodeData = stackv2.peek();
				if(null != nodeData)
					System.out.println("Top node from the stack " + nodeData );
				stackv2.traverse();
				break;
			case 4:
				stackv2.traverse();
				break;
			case 5:
				bExit = true;
				break;
			default:
				System.out.println("Invalid Option");
				break;
					
			}
		}
		in.close();
	}

}
