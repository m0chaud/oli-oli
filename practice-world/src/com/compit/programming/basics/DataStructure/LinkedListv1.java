package com.compit.programming.basics.DataStructure;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 12, 2017
 * 
 */

/*
 * This class is already defined in this package
 * class Node{
	Integer data;
	Node nextNode;

	public Node(){
		//To allow to create object with empty constructer
	}
	public Node(int data){
		this.data = data;
	}

	public void setData(int data){
		this.data = data;
	}

	public Integer getData(){
		return data;
	}
}
 */

public class LinkedListv1 {

	Node headNode = null;

	public Node getHeadNode(){
		return headNode;
	}

	public void add(int data){
		Node newNode = new Node(data);

		if(isEmpty()){
			headNode = newNode;
			return;
		}

		Node currentNode = getHeadNode();
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode); ;
	}

	public void removeFromTail(){
		if(isEmpty()){
			//Empty list do nothing
			return;
		}
		if(getHeadNode().getNext() == null){
			headNode = null;
			return;
		}
		Node currentNode = getHeadNode();
		Node prevNode = getHeadNode();
		
		while(currentNode.getNext() != null){
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		//head --> nextNode --> null
		// currentNode = nextNode
		// prevNode = head
		//head --> null
		//currentNode=prevNode=head
		prevNode.setNext(null);
		currentNode = null; // need to revisit setting object to null is not working need to set explicit setNext(null)
		//Java is pass by value. currentNode points to address where data and next node is set.
		//currentNode --> data = x, next = null (AA)
		//when I set currentNode = null (BB)
		//We are not modifing data and next at existing location
		//Instead we are pointing to new location at null
		//
	}

	public void removeFromHead(){
		if(isEmpty()){
			//Empty list do nothing
			return;
		}

		Node newHead = getHeadNode().getNext();
		headNode = null; // to free up memory
		headNode = newHead;

	}

	public void traverse(){
		Node currentNode = getHeadNode();
		while(currentNode != null){
			System.out.print(currentNode.getData() + " --> ");
			currentNode = currentNode.getNext();
		}
		System.out.println("");
	}

	public void removeValue(){

	}

	public boolean isEmpty(){
		if(getHeadNode() == null)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		LinkedListv1 linkedList = new LinkedListv1();

		System.out.println("Select choice from below");
		System.out.println("1. Add Values to list, use -99 to break from entering value");
		System.out.println("2. Traverse the list");
		System.out.println("3. Remove value from head");
		System.out.println("4. Remove value from tail");
		System.out.println("5. Exit");

		int choice;
		boolean exitFlag = false;
		int data;

		while(!exitFlag){

			choice = in.nextInt();

			switch(choice){
			case 1:
				while(in.hasNextInt()){
					data = in.nextInt();
					if(data == -99) break;
					linkedList.add(data);	
				}
				linkedList.traverse();
				break;
			case 2:
				linkedList.traverse();
				break;
			case 3:
				linkedList.removeFromHead();
				linkedList.traverse();
				break;
			case 4:
				linkedList.removeFromTail();
				linkedList.traverse();
				break;
			case 5:
				exitFlag = true;
				break;
			default:
				break;
			}
			
			System.out.println("Enter new choice");
		}

		in.close();
	}

}
