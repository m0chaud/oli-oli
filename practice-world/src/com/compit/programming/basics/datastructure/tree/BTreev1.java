package com.compit.programming.basics.datastructure.tree;

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

	public void setRootNode(int data){
		this.rootNode = new BTreeNode(data);
	}
	public BTreev1(){
		this.rootNode = null;
	}

	public boolean isTreeEmpty(){
		return (getRootNode()==null)?true:false;
	}

	public void insert(int data){

		if(isTreeEmpty()){
			setRootNode(data);
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

	public BTreeNode remove(){
		BTreeNode bTreeNode = new BTreeNode();

		return bTreeNode;
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

	public void preOrderTraverse(){

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
		
		bTree.insert(5);
		bTree.insert(3);
		bTree.insert(7);
		
		bTree.inOrderTraverse(bTree.getRootNode());
	}

}
