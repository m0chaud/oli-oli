package com.compit.programming.basics.datastructure;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class LinkedListv1 {

	Node headNode;

	public void setHeadNode(Node headNode){
		this.headNode = headNode;
	}

	public Node getHeadNode(){
		return this.headNode;
	}

	public boolean isEmpty(){
		return (headNode == null)?true:false;
	}

	public void print(){
		Node currentNode;

		if(isEmpty()){
			System.out.println("-> Linke List is Empty");
		}

		currentNode = getHeadNode();

		while(currentNode != null){

			System.out.print(" " + currentNode.getData() + " --> ");

			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}

	public void insert(int data){

		Node dataNode = new Node();
		dataNode.setData(data);
		Node currentNode;
		if(isEmpty())
		{
			setHeadNode(dataNode);
			return;
		}

		currentNode = getHeadNode();
		while(currentNode.getNextNode() != null){
			currentNode = currentNode.getNextNode();
		}
		currentNode.setNextNode(dataNode);
	}

	public int deleteAtHead(){

		if(isEmpty()){
			System.out.println("Linked list is empty");
			return -9999;
		}
		Node currentNode = getHeadNode();

		setHeadNode(currentNode.getNextNode());
		return currentNode.data;
	}

	public int deleteAtTail(){

		if(isEmpty()){
			System.out.println("Linked list is empty");
			return -9999;
		}

		Node currentNode = getHeadNode();
		Node dataNode = getHeadNode();

		if(currentNode.getNextNode() == null){

			setHeadNode(currentNode);

		}else{
			while(currentNode.getNextNode().getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			dataNode = currentNode.getNextNode();
			currentNode.setNextNode(null);
		}

		return dataNode.getData();
	}

	public int deleteFromStartAtIndex(int index){

		if(isEmpty()){
			System.out.println("Linked list is empty");
			return -9999;
		}
		Node currentNode = getHeadNode();
		int i = 1;
		while(currentNode != null){
			if(i == index){
				break;
			}
			currentNode = currentNode.getNextNode();
			i++;
		}

		return (currentNode == null)?-9999:currentNode.getData();
	}

	public int deleteFromEndAtIndex(int index){

		if(isEmpty()){
			System.out.println("Linked list is empty");
			return -9999;
		}
		Node currentNode = getHeadNode();
		Node dataNode = getHeadNode();
		int i = 0;
		while(currentNode != null){
			i++;
			if(i >= index){
				dataNode = dataNode.getNextNode();
			}
			currentNode = currentNode.getNextNode();
		}

		return (dataNode == null)?-9999:dataNode.getData();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListv1 list1 = new LinkedListv1();
		Scanner in = new Scanner(System.in);
		System.out.println("Select below option to perform action on Linked List");
		System.out.println("1. To insert data in to Linked List");
		System.out.println("2. To delete data at head in to Linked List");
		System.out.println("3. To delete data at tail in to Linked List");
		System.out.println("4. To delete data from start index in to Linked List");
		System.out.println("5. To delete data from end index in to Linked List");
		System.out.println("6. To print Linked List");
		System.out.println("7. Exit");

		int option;
		boolean readOption = true;
		int data;
		int index;
		while(readOption){
			System.out.println(" Select an option ");
			option = in.nextInt();

			switch(option){
			case 1:
				System.out.println("-> Enter value for Node");
				data = in.nextInt();
				list1.insert(data);
				list1.print();
				System.out.println("->-<-");
				break;
			case 2:
				data = list1.deleteAtHead();
				if(data != -9999){
					System.out.println("Deleted node value from head - " + data);
					list1.print();
				}

				System.out.println("->-<-");					
				break;
			case 3:
				data = list1.deleteAtTail();

				if(data != -9999){
					System.out.println("Deleted node value from tail - " + data);
					list1.print();
				}

				System.out.println("->-<-");					
				break;
			case 4:
				System.out.println("-> Enter index from start");
				index = in.nextInt();
				data = list1.deleteFromEndAtIndex(index);
				if(data != -9999){
					System.out.println("Deleted node value from start index " + index + " - " + data);
					list1.print();
				}

				System.out.println("->-<-");					
				break;
			case 5:
				System.out.println("-> Enter index from end");
				index = in.nextInt();
				data = list1.deleteFromEndAtIndex(index);
				if(data != -9999){
					System.out.println("Deleted node value from end index " + index + " - " + data);
					list1.print();
				}
				System.out.println("->-<-");					
				break;
			case 6:
				list1.print();
				System.out.println("->-<-");
				break;
			case 7:
				readOption = false;
				break;
			default:
				System.out.println("-> Enter Valid Option");
				break;

			}
		}

		in.close();
	}

}
