package com.compit.programming.basics.datastructure.tree;

import java.util.List;

/**
 * @author: chaudharimehul
 * @date:	May 30, 2017
 * 
 */
public class TreeNode {

	int data;
	List<TreeNode> childNodes;

	public TreeNode(){
		
	}
	
	public TreeNode(int data){
		this.data = data;
		this.childNodes = null;
	}
	
	public TreeNode(int data, List<TreeNode> childNodes){
		this.data = data;
		this.childNodes = childNodes;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setChildNodes(List<TreeNode> childNodes){
		this.childNodes = childNodes;
	}
	
	public List<TreeNode> getChildNodes(){
		return this.childNodes;
	}
}
