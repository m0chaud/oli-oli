package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class Node {
	
	int data;
	Node next;
	Node prev;
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public Node getNextNode(){
		return this.next;
	}
	
	public void setNextNode(Node next){
		this.next = next;
	}
	
	public Node getPrevNode(){
		return this.prev;
	}
	
	public void setPrevNode(Node prev){
		this.prev = prev;
	}
}
