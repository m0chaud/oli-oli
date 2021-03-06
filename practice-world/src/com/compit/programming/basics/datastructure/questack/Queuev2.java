package com.compit.programming.basics.datastructure.questack;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 29, 2017
 * Queue v2 with generics
 * For generic String dataType is used for this implementation
 */
public class Queuev2<A> {

	GenericNode<A> topNode;
	
	public void setTopNode(GenericNode<A> topNode){
		this.topNode = topNode;
	}
	
	public GenericNode<A> getTopNode(){
		return this.topNode;
	}

	public boolean isEmpty(){
		return ( (getTopNode()!=null)?false:true );
	}
	
	public void add(A data){
		GenericNode<A> node = new GenericNode<A>(data);
		GenericNode<A> currentNode = getTopNode();
		if(isEmpty())
		{
			setTopNode(node);
		}
		else{
			while(null != currentNode.getNext()){
				currentNode  = currentNode.getNext();
			}
			currentNode.setNext(node);
		}
	}
	
	public A remove(){
		A data = null;
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			data = getTopNode().getData();
			setTopNode(getTopNode().getNext());
		}
		return data;
	}
	
	public A peek(){
		A data = null;
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			data = getTopNode().getData();
		}
		return data;
	}
	
	public void traverse(){
		GenericNode<A> currentNode = getTopNode();
		while(currentNode != null){
			System.out.print(currentNode.getData() +" --> ");
			currentNode = currentNode.getNext();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Queuev2<String> queuev2 = new Queuev2<String>();
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
						queuev2.add(data);
						data = in.next();
					}
					queuev2.traverse();
				break;
			case 2:
				nodeData = queuev2.remove();
				if(null != nodeData)
					System.out.println("Node removed from the stack " + nodeData );
				queuev2.traverse();
				break;
			case 3:
				nodeData = queuev2.peek();
				if(null != nodeData)
					System.out.println("Top node from the stack " + nodeData );
				queuev2.traverse();
				break;
			case 4:
				queuev2.traverse();
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
