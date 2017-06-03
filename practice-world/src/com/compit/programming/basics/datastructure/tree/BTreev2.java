package com.compit.programming.basics.datastructure.tree;

import java.util.Random;

//import com.compit.programming.basics.datastructure.questack.Stackv2;
import com.compit.programming.basics.datastructure.questack.Queuev2;
/**
 * @author: chaudharimehul
 * @date:	Jun 3, 2017
 * 
 */
public class BTreev2 {

	BTreeNode rootNode;

	public BTreeNode getRootNode(){
		return this.rootNode;
	}

	public void setRootNode(int data){
		this.rootNode = new BTreeNode(data);
	}

	public BTreev2(){
		this.rootNode = null;
	}

	public boolean isTreeEmpty(){
		return (this.rootNode == null)?true:false;
	}

	public void insert(int data, BTreeNode currentNode){
		if(isTreeEmpty()){
			System.out.println(" Insert root node " + data);
			setRootNode(data);
			return;
		}

		if(data <= currentNode.getData()){
			if(currentNode.getLeft() != null){
				insert(data, currentNode.getLeft());
			}
			else{
				currentNode.setLeft(data);
				System.out.println(" Node inserted to left " + data);
				return;
			}
		}else{
			if(currentNode.getRight() != null ){
				insert(data, currentNode.getRight());
			}else{
				currentNode.setRight(data);
				System.out.println(" Node inserted to right " +  data);
				return;
			}
		}
	}

	public void inOrderTraverse(BTreeNode currentNode){

		if(currentNode == null){
			return;
		}

		if(currentNode.getLeft() != null){
			inOrderTraverse(currentNode.getLeft());
		}

		System.out.println(currentNode.getData() + " -- ");

		if(currentNode.getRight() != null){
			inOrderTraverse(currentNode.getRight());
		}
	}

	public void preOrderTraverse(BTreeNode currentNode){
		if(currentNode == null){
			return;
		}

		
		Queuev2<BTreeNode> queue = new Queuev2<BTreeNode>();
		
		queue.add(currentNode);
		
		while(true){
			
			currentNode = queue.remove();
			System.out.println(currentNode.getData() + " -- ");
			
			if(currentNode.getLeft() != null){
				System.out.println(" Left node pushed: " + currentNode.getLeft().getData() );
				queue.add(currentNode.getLeft());
			}
			if(currentNode.getRight() != null){
				System.out.println(" Right node pushed: " + currentNode.getRight().getData());
				queue.add(currentNode.getRight());
			}
			if(queue.isEmpty()){
				break;
			}
		}
		
		//I need queue instead of stack
/*		Stackv2<BTreeNode> stack = new Stackv2<BTreeNode>();
		
		stack.push(currentNode);
		
		while(true){
			
			currentNode = stack.pop();
			System.out.println(currentNode.getData() + " -- ");
			
			if(currentNode.getLeft() != null){
				System.out.println(" Left node pushed: " + currentNode.getLeft().getData() );
				stack.push(currentNode.getLeft());
			}
			if(currentNode.getRight() != null){
				System.out.println(" Right node pushed: " + currentNode.getRight().getData());
				stack.push(currentNode.getRight());
			}
			if(stack.isEmpty()){
				break;
			}
		}*/
	}

	public void postOrderTraverse(BTreeNode currentNode){
		if(currentNode == null){
			return;
		}
		
		if(currentNode.getLeft() != null){
			postOrderTraverse(currentNode.getLeft());
		}

		if(currentNode.getRight() != null){
			postOrderTraverse(currentNode.getRight());
		}
		
		System.out.println(currentNode.getData() + " -- ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTreev2 tree = new BTreev2();

		Random random = new Random();

		for(int i = 0 ; i < 10 ; i++ ){
			tree.insert( random.nextInt(50) , tree.getRootNode() );
		}

		System.out.println("InOrder traverse with recursion");
		tree.inOrderTraverse(tree.getRootNode());
		System.out.println(" PreOrder traverse without recursion ");
		tree.preOrderTraverse(tree.getRootNode());
		System.out.println(" PostOrder traverse with recursion ");
		tree.postOrderTraverse(tree.getRootNode());

	}
}
