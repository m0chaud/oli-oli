package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 2, 2017
 * 
 */
public interface LinkedList <T> {
	
	public void insert(T data);
	
	public void print();
	
	public T deleteAtHead();
	
	public T deleteAtTail();
	
	public void deleteAllNodes();
	
	public void initializeDefaultList();
}
