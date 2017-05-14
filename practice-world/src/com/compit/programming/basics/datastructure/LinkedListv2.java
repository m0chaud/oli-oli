package com.compit.programming.basics.datastructure;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 13, 2017
 * 
 * LinkedListv2
 * Traverse the Linked list, through recursion
 * remove odd values from linked list
 * remove even values from linked list
 */
public class LinkedListv2 {
	
	Node headNode = null;
	
	public void add(int data){
		Node newNode = new Node(data);
		
		if(isEmpty()){
			headNode = newNode;
			return;
		}
		Node currentNode = headNode;
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
	}
	
	public void removeEvenValueNode(){
		if(isEmpty())
			return;
		Node currentNode = getHeadNode();
		Node prevNode = (getHeadNode().getData() % 2 != 0)?getHeadNode():null;
		
		// 1 -->
		// 2 -->
		// 2 --> 2 -->
		// 1 --> 2 --> 3 -->
		// 1 --> 2 --> 2 -->
		// 1 --> 1 --> 2 --> 1 -->
		
		while(currentNode != null){
			if( (currentNode.getData() % 2) == 0 )
			{
				if( currentNode == getHeadNode() ){
					setHeadNode(currentNode.getNext());
				}
				if(null != prevNode)
					prevNode.setNext(currentNode.getNext());
			}else{
				prevNode = currentNode;
			}
			currentNode = currentNode.getNext();
		}
	}
	
	public void removeOddValueNode(){
		if(isEmpty())
			return;
		
		Node currentNode = getHeadNode();
		Node prevNode = (getHeadNode().getData() % 2 == 0)?getHeadNode():null;
		
		while(currentNode != null){
			if(currentNode.getData() % 2 != 0){
				if(currentNode == getHeadNode())
					setHeadNode(currentNode.getNext());
				
				if(null != prevNode)
					prevNode.setNext(currentNode.getNext());
			}
			else
			{
				prevNode = currentNode;
			}
			currentNode = currentNode.getNext();
		}
	}

	//use of recursion to traverse the linked list
	public void traverse(Node node){
		if(node == null){
			System.out.println("");
			return;
		}
		System.out.print(node.getData() + " --> ");
		traverse(node.getNext());
	}
	
	public boolean isEmpty(){
		if(getHeadNode() == null){
			return true;
		}
		return false;
	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		boolean bExitFlag = false;
		int choice;
		
		LinkedListv2 linkedListv2 = new LinkedListv2();
		
		System.out.println("Enter below option to process linked list");
		System.out.println("1. Add Value to linked, Enter -99 to exit the list");
		System.out.println("2. Traverse the linked list");
		System.out.println("3. Remove node with even value");
		System.out.println("4. Remove node with odd value");
		System.out.println("5. Exit");
		
		while(!bExitFlag){
			System.out.println("Enter Choice");
			choice = in.nextInt();
			switch(choice){
			case 1:
					while(true){
						int data = in.nextInt();
						if(data == -99) break;
						linkedListv2.add(data);
					}
					linkedListv2.traverse(linkedListv2.getHeadNode());
				break;
			case 2:
				linkedListv2.traverse(linkedListv2.getHeadNode());
				break;
			case 3:
				linkedListv2.removeEvenValueNode();
				linkedListv2.traverse(linkedListv2.getHeadNode());
				break;
			case 4:
				linkedListv2.removeOddValueNode();
				linkedListv2.traverse(linkedListv2.getHeadNode());
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
