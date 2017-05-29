package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	May 28, 2017
 * 
 */
public class Node{
	int data;
	Node next;
	
	public Node(){
		
	}
	
	/**
	 * @param data
	 * To create new node with data, next node will be set to null
	 * 
	 */
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
