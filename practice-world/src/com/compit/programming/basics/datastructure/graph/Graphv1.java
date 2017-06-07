package com.compit.programming.basics.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.compit.programming.basics.datastructure.questack.Queuev1;

/**
 * @author: chaudharimehul
 * @date:	May 30, 2017
 * 
 */
public class Graphv1 {
	
	List<GraphNode> nodeList;
	LinkedList<Integer> edge[];
	int nodeID;
	
	int numberOfVertices = 10;
	
	public Graphv1(int data)
	{
		this.nodeList = new ArrayList<GraphNode>();
		this.edge = new LinkedList[numberOfVertices];
		for(int i = 0 ; i < numberOfVertices ; i++){
			this.edge[i] = new LinkedList<Integer>();
		}
		this.nodeID = 0;
		
		GraphNode node = new GraphNode(data);
		addNode(node);
	}
	public int getNodeID(){
		return this.nodeID;
	}
	void addNode(int data){
		addNode(new GraphNode(data));
	}
	void addNode(GraphNode node){
		this.nodeList.add(this.nodeID, node);
		increamentNodeID();
	}
	
	void addEdge(int nodeIdA, int nodeIdB){
		edge[nodeIdA].add(nodeIdB);
	}
	
	public void increamentNodeID(){
		this.nodeID++;
	}
	
	public void bfs(int nodeID){
		Queuev1 queue = new Queuev1();
		boolean[] visited = new boolean[getNodeID()];
		queue.add(nodeID);
		
		while(!queue.isEmpty()){
			//Get nodeID, from nodeID get the node, from node print the data
			int nodeIndex = queue.remove().getData();
			System.out.println( nodeList.get( nodeIndex ).getData() + " ---> "); //TODO: change return type for Queuev1.remove()
			visited[nodeIndex] = true;
			
			LinkedList<Integer> edgeList = edge[nodeIndex];
			for(Integer edgeId : edgeList){
				if(!visited[edgeId])
					queue.add(edgeId);
			}
		}
	}
	
	public void dfs(){
		
	}
	
	public GraphNode remove(){
		GraphNode graphNode = new GraphNode();
		
		return graphNode;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphv1 graph = new Graphv1(1);
		
		graph.addNode(2);
		graph.addNode(3);
		graph.addNode(4);
		graph.addNode(5);
		graph.addNode(6);
		graph.addNode(7);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		
		graph.bfs(1);
	}

}
