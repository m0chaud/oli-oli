package com.compit.programming.basics.datastructure.tree;

/**
 * @author: chaudharimehul
 * @date:	Jun 1, 2017
 * 
 */
public class BTreeNode {
	int data;
	BTreeNode left;
	BTreeNode right;
	
	public BTreeNode(){
		
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public BTreeNode getLeft(){
		return this.left;
	}
	
	public BTreeNode getRight(){
		return this.right;
	}
	
	public void setRight(int data){
		this.right = new BTreeNode(data);
	}
	
	public void setLeft(int data){
		this.left = new BTreeNode(data);
	}
	
	public BTreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BTreeNode(int data, BTreeNode left, BTreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
