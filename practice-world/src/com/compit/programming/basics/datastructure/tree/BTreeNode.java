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
