package com.compit.programming.basics.datastructure.graph;

import java.util.List;

/**
 * @author: chaudharimehul
 * @date:	May 30, 2017
 * 
 */
public class GraphNode {
	
	int data;
	List<GraphNode> neighbourNodes;
	
	public GraphNode(){
		
	}
	
	public GraphNode(int data){
		this.data = data;
		this.neighbourNodes = null;
	}
	
	public GraphNode(int data, List<GraphNode> neighbourNodes){
		this.data = data;
		this.neighbourNodes = neighbourNodes;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNeighbourNodes(List<GraphNode> neighbourNodes){
		this.neighbourNodes = neighbourNodes;
	}
	
	public List<GraphNode> getNeighbourNodes(){
		return this.neighbourNodes;
	}
}
