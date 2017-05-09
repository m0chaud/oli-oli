package com.org.personaldev.DataStructure;

import java.util.Scanner;

/**
 * @author chaudharimehul
 *
 */
class DualNode{
	int data;
	DualNode next;
	DualNode previous;
	
	public DualNode(){
		
	}
	
	public DualNode(int data, DualNode next, DualNode previous) {
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DualNode getNext() {
		return next;
	}
	public void setNext(DualNode next) {
		this.next = next;
	}
	public DualNode getPrevious() {
		return previous;
	}
	public void setPrevious(DualNode previous) {
		this.previous = previous;
	}

}
public class DoubleLinkedList {

	DualNode head = null;
	
	public boolean isEmpty(){
		if(head == null) return true;
		
		return false;
	}
	
	public void insertAtTail(int data){
		DualNode node = new DualNode(data, null, null);
		
		if(isEmpty()){
			head = node;
		}else {
			DualNode current = head;
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(node);
			node.setPrevious(current);
		}
	}
	public void removeFromTail(){
		if(isEmpty()){
			System.out.println("List is Empty No Node to remove");
		}else if(head.getNext() == null){
			head = null;
		}
		else {
			
			DualNode current = head;
			DualNode previous = head;
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
			DualNode current = head;
			while(current.getNext() != null){
				System.out.print(" " + current.getData() + " --> ");
				current = current.getNext();
			}
			System.out.println(" " + current.getData());
		}
	}

	public void traverseFrontAndBack(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}else {
			DualNode current = head;
			while(current.getNext() != null){
				System.out.print(" " + current.getData() + " --> ");
				current = current.getNext();
			}
			System.out.println(" " + current.getData());
			
			while(current.getPrevious() != null){
				System.out.print(" " + current.getData() + " --> ");
				current = current.getPrevious();
			}
			System.out.println(" " + current.getData());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		DoubleLinkedList list = new DoubleLinkedList();
		int choice;
		while(true){
			System.out.println("Enter choice as below");
			System.out.println("1.> Insert Node in Linked list at head ");
			System.out.println("2.> Remove Node from linked list from tail");
			System.out.println("3.> Traverse Linked list from Head");
			System.out.println("4.> TraverseFrontAndBack Linked list from Head");
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
				System.out.println("Traverse Linked list FrontAndBack");
				list.traverseFrontAndBack();
				System.out.println("-----------------------------");
				break;
			case 5:
				System.out.println("Exit from Process");
				System.out.println("-----------------------------");
				userInput.close();
				System.exit(0);

			default:
				System.out.println("Invalid Option");
				System.out.println("-----------------------------");
				break;
			}
		}
	}
}
