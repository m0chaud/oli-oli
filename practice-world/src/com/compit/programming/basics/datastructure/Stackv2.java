package com.compit.programming.basics.datastructure;

import java.util.Scanner;

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
	
	public GenericNode<T> pop(){
		GenericNode<T> node = null;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			node = getTopNode();
			setTopNode(getTopNode().getNext());
		}
		return node;
	}
	
	public GenericNode<T> peek(){
		GenericNode<T> node = null;

		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			node = getTopNode();
		}
		
		return node;
	}
	
	public void travese(){
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
		GenericNode<String> node = new GenericNode<String>();
		
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
					stackv2.travese();
				break;
			case 2:
				node = stackv2.pop();
				if(null != node)
					System.out.println("Node removed from the stack " + node.getData() );
				break;
			case 3:
				node = stackv2.peek();
				if(null != node)
					System.out.println("Top node from the stack " + node.getData() );
				break;
			case 4:
				stackv2.travese();
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
