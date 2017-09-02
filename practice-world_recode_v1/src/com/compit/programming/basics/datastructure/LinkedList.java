package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 2, 2017
 * 
 */
public interface LinkedList <T> {
	
	public void insert(T data);
	
	public void print();
	
	public void deleteAtHead();
	
	public void deleteAtTail();
	
	public void deleteAllNodes();
	
	public void initializeDefaultList();
	
	public boolean isEmpty();
	
	public void setHeadNode(GenericNode<T> headNode);
	
	public GenericNode<T> getHeadNode();
}
