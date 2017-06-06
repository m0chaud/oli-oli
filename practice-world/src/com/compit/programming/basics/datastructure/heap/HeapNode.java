package com.compit.programming.basics.datastructure.heap;


/**
 * @author: chaudharimehul
 * @date:	Jun 4, 2017
 * 
 */
public class HeapNode {
	int data;
	HeapNode left;
	HeapNode right;
	
	public HeapNode(){
	}
	
	public HeapNode(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setLeft(int data){
		this.left = new HeapNode(data);
	}
	
	public void setLeft(HeapNode left){
		this.left = left;
	}
	
	public void setRight(int data){
		this.right = new HeapNode(data);
	}
	
	public void setRight(HeapNode right){
		this.right = right;
	}
	
	public int getData(){
		return this.data;
	}
	
	public HeapNode getLeft(){
		return this.left;
	}
	
	public HeapNode getRight(){
		return this.right;
	}
}
