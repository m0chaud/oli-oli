package com.compit.programming.basics.datastructure.questack;

/**
 * @author: chaudharimehul
 * @date:	May 28, 2017
 * 
 */
public class GenericNode<T>  {
	
	T data;
	GenericNode<T> next;
	
	public GenericNode(){
		
	}
	
	public GenericNode(T data){
		this.data = data;
		this.next = null;
	}
	
	public GenericNode(T data, GenericNode<T> next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setNext(GenericNode<T> next){
		this.next = next;
	}
	
	public GenericNode<T> getNext(){
		return this.next;
	}
	
}
