package com.compit.programming.basics.datastructure;

public class GenericNode<T> {
	T data;
	GenericNode<T> next;
	GenericNode<T> prev;
	
	public GenericNode(){
	}
	
	public GenericNode(T data){
		this.data = data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setNextNode(GenericNode<T> next){
		this.next = next;
	}
	
	public GenericNode<T> getNextNode(){
		return this.next;
	}
	
	public void setPrevNode(GenericNode<T> prev){
		this.prev = prev;
	}
	
	public GenericNode<T> getPrevNode(){
		return this.prev;
	}
}
