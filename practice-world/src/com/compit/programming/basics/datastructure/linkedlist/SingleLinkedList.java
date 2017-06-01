package com.compit.programming.basics.datastructure.linkedlist;

import java.util.Scanner;

public class SingleLinkedList {

	Node head = null;
	
	public boolean isEmpty(){
		if(head == null) return true;
		
		return false;
	}
	
	public void insertAtTail(int data){
		Node node = new Node();
		
		node.setData(data);
		node.setNext(null);
		
		if(isEmpty()){
			head = node;
		}else {
			Node current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(node); 
		}
	}
	public void removeFromTail(){
		if(isEmpty()){
			System.out.println("List is Empty No Node to remove");
		}else if(head.getNext() == null){
			head = null;
		}
		else {
			
			Node current = head;
			Node previous = head;
			while(current.next != null){
				previous = current;
				current = current.getNext();
			}
			previous.setNext(null);
			current = null;
		}
	}
	public void traverse(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}else {
			Node current = head;
			while(current.getNext() != null){
				System.out.print(" " + current.getData() + " --> ");
				current = current.getNext();
			}
			System.out.println(" " + current.getData());
		}
	}
	private void removeEven() {
		// TODO Auto-generated method stub
		Node prevNode = head;
		Node currNode = head;
		if(isEmpty()){
			System.out.println("List is Empty No Node to remove");
		}
		while(currNode != null){
			if((currNode.getData() % 2) == 0 ){
				if(currNode == head){
					head = currNode.getNext();
				}
				prevNode.setNext(currNode.getNext());
				currNode = null;
				currNode = prevNode.getNext();
			}else{
				prevNode = currNode;
				currNode = currNode.getNext();
			}
		}
		System.out.println(head.getData());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		SingleLinkedList list = new SingleLinkedList();
		int choice;
		while(true){
			System.out.println("Enter choice as below");
			System.out.println("1.> Insert Node in Linked list at head ");
			System.out.println("2.> Remove Node from linked list from tail");
			System.out.println("3.> Traverse Linked list from Head");
			System.out.println("4.> Remove even node from Linked List");
			System.out.println("5.> Exit from the process");

			choice = userInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Insert Entry to Linked List");
				list.insertAtTail(userInput.nextInt());
				list.traverse();
				System.out.println("-----------------------------");
				break;
			case 2:
				System.out.println("Remove Entry to Linked List");
				list.removeFromTail();
				list.traverse();
				System.out.println("-----------------------------");
				break;
			case 3:
				System.out.println("Traverse Linked list from Head");
				list.traverse();
				System.out.println("-----------------------------");
				break;
			case 4:
				System.out.println("Remove Even Nodes from Link");
				list.removeEven();
				list.traverse();
				System.out.println("-----------------------------");
				break;
			case 5:
				System.out.println("Exit from Process");
				System.out.println("-----------------------------");
				userInput.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");
				System.out.println("-----------------------------");
				break;
			}
		}
	}
}
