package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 23, 2017
 * 
 */
public interface Queue<T> {

	public void add(T data);
	
	public T remove();
	
	public T peek();
	
	public void print();
	
	public boolean isEmpty();

}
