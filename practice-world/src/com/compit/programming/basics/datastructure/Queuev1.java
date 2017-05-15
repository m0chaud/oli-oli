package com.compit.programming.basics.datastructure;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 */
public class Queuev1{
	
	Node topNode = null;
	
	public void setTopNode(Node topNode){
		this.topNode = topNode;
	}
	
	public Node getTopNode(){
		return topNode;
	}
	
	public void add(int data){
		Node node = new Node(data);
		if(isEmpty()){
			setTopNode(node);
			return;
		}
		Node currentNode = getTopNode();
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(node);
	}
	
	public Node remove(){
		Node node = getTopNode();
		if(null != node)
			setTopNode(node.getNext());
		return node;
	}
	
	public void traverse(){
		if(isEmpty()){
			System.out.println(" Queue is empty. ");
		}
		Node currentNode = getTopNode();
		while(currentNode != null){
			System.out.print(currentNode.getData() + " --> ");
			currentNode = currentNode.getNext();
		}
	}
	
	public Node peek(){
		return getTopNode();
	}
	
	public boolean isEmpty(){
		if(null == getTopNode() )
			return true;
		return false;
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		Queuev1 queue = new Queuev1();
		System.out.println("Enter Choice as below");
		System.out.println("1. Add to the queue. Enter -99 to stop from add operation.");
		System.out.println("2. Remove from the queue.");
		System.out.println("3. Peek from the queue.");
		System.out.println("4. Traverse the queue.");
		System.out.println("5. Exit.");
		
		int choice;
		boolean bExitFlag = false;
		int data;
		while(!bExitFlag){
			choice = in.nextInt();
			switch(choice){
			case 1:
				data = in.nextInt();
				while(data != -99){
					queue.add(data);
					data = in.nextInt();
				}
				System.out.println("");
				queue.traverse();
				break;
			case 2:
				Node removeNode = queue.remove();
				if(null != removeNode)
					System.out.println("Remove element value -- " + removeNode.getData());
				else
					System.out.println(" Queue is empty. ");
				System.out.println("");
				queue.traverse();
				break;
			case 3:
				Node peekNode = queue.peek();
				if(null != peekNode)
					System.out.println("Peek element value -- "+ peekNode.getData());
				else
					System.out.println(" Queue is empty. ");
				System.out.println("");
				queue.traverse();
				break;
			case 4:
				System.out.println("");				
				queue.traverse();
				break;
			case 5:
				bExitFlag = true;
				break;
			default:
				break;
			}
		}
		in.close();
	}
}