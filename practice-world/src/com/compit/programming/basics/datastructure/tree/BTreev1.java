package com.compit.programming.basics.datastructure.tree;

import com.compit.programming.basics.datastructure.questack.Queuev2;

/**
 * @author: chaudharimehul
 * @date:	Jun 1, 2017
 * 
 */
public class BTreev1 {

	BTreeNode rootNode;

	public BTreeNode getRootNode(){
		return this.rootNode;
	}

	public void setRootNode(BTreeNode rootNode){
		this.rootNode = rootNode;
	}
	public BTreev1(){
		this.rootNode = null;
	}

	public boolean isTreeEmpty(){
		return (getRootNode()==null)?true:false;
	}

	public void insert(int data){

		if(isTreeEmpty()){
			setRootNode(new BTreeNode(data));
			return;
		}

		BTreeNode currentNode = getRootNode();
		while(true){

			if( data < currentNode.getData() ){
				//if insert data is less than currentNode go to left tree
				if(currentNode.getLeft() == null){
					currentNode.setLeft(data);
					break;
				}else{
					currentNode = currentNode.getLeft();
				}
			}else{
				//if insert data is greater than current node than go to right tree
				if(currentNode.getRight() == null){
					currentNode.setRight(data);
					break;
				}else{
					currentNode = currentNode.getRight();
				}
			}
		}
	}

	public BTreeNode getLeftMostNode(BTreeNode currentNode){
		boolean isLeftMostNodeFound = false;
		while(!isLeftMostNodeFound){
			if(currentNode.getLeft() == null && currentNode.getRight() == null){
				isLeftMostNodeFound = true;
			}else if(currentNode.getRight() == null){
				isLeftMostNodeFound = true;
			}
			else if(currentNode.getLeft() != null){
				currentNode = currentNode.getLeft();
			}else if(currentNode.getRight() != null){
				currentNode = currentNode.getRight();
			}
		}
		return currentNode;
	}

	public BTreeNode getNewParentNode(BTreeNode currentNode, int data){
		if(currentNode.getLeft() != null && currentNode.getRight() != null){
			BTreeNode newRootNode = currentNode.getRight();
			BTreeNode leftMostNode = getLeftMostNode(currentNode);

			//Left node of new parent moved
			leftMostNode.setRight(newRootNode.getLeft());
			//New parent left node is set
			newRootNode.setLeft(currentNode.getLeft());
			//Change the parent node
			currentNode = newRootNode;
		}else if(currentNode.getData() == data && currentNode.getLeft() == null){
			currentNode = currentNode.getRight();
		}else if(currentNode.getData() == data && currentNode.getRight() == null){
			currentNode = currentNode.getLeft();
		}
		return currentNode;
	}

	public void remove(int data){

		if(isTreeEmpty()){
			System.out.println("This tree is empty");
			return;
		}

		BTreeNode currentNode = getRootNode();

		if(currentNode.getData() == data) {
			setRootNode(getNewParentNode(currentNode, data));
			return;
		}

		while(true){

			if(currentNode.getLeft() != null && data == currentNode.getLeft().getData()){
				currentNode.setLeft(getNewParentNode(currentNode.getLeft(), data));
				break;
			}else if(currentNode.getRight() != null && data == currentNode.getRight().getData()){
				currentNode.setRight(getNewParentNode(currentNode.getRight(), data));
				break;
			}

			if(data < currentNode.getData()){
				currentNode = currentNode.getLeft();
			}else if(currentNode.getData() < data){
				currentNode = currentNode.getRight();
			}else{
				currentNode = null;
			}

			if(null == currentNode){
				System.out.println("Data not found in tree: " + data);
				break;
			}
		}
	}

	public void inOrderTraverse(BTreeNode currentNode){
		//If left tree is not empty move towards left node
		if(currentNode.getLeft() != null){
			inOrderTraverse(currentNode.getLeft());
		}

		//Print Node data
		System.out.println(currentNode.getData() + " -- ");

		//If right node is not empty move towards right node
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
	}

	public void postOrderTraverse(){

	}

	public BTreeNode search(int data){
		BTreeNode bTreeNode = new BTreeNode();

		return bTreeNode;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTreev1 bTree = new BTreev1();

		bTree.insert(41);
		bTree.insert(28);
		bTree.insert(32);
		bTree.insert(35);
		bTree.insert(38);
		bTree.insert(1);
		bTree.insert(16);
		bTree.insert(46);
		bTree.insert(38);
		bTree.insert(32);

		System.out.println("In-oreder traverse");
		bTree.inOrderTraverse(bTree.getRootNode());

		System.out.println("Remove first node with value 32");

		bTree.remove(32);
		//bTree.remove(35);
		
		System.out.println("Pre-Order Traverse");
		bTree.preOrderTraverse(bTree.getRootNode());
		
		System.out.println("In-order traverse");
		bTree.inOrderTraverse(bTree.getRootNode());
	}

}
