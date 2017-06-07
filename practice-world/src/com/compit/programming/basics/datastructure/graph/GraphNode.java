package com.compit.programming.basics.datastructure.graph;

/**
 * @author: chaudharimehul
 * @date:	May 30, 2017
 * 
 */
public class GraphNode {
	int data;
	
	public GraphNode(){
		
	}
	
	public GraphNode(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
}
