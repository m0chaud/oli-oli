package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 23, 2017
 * 
 */
public interface Stack<T> {

	public void push(T data);
	
	public T pop();
	
	public T peek();
	
	public void print();
	
	public boolean isEmpty();

}
