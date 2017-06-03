package com.compit.programming.basics.datastructure.tree;

import java.util.List;
import java.util.ArrayList;

/**
 * @author: chaudharimehul
 * @date:	May 30, 2017
 * 
 * After putting couple of option, going with reminder option,
 * Here tree will grow linearly but will revisit to have better criteria for creating good data structure for n-array tree.
 * 
 */
public class Treev1 {

	TreeNode rootNode;

	public void setRootNode(TreeNode rootNode){
		this.rootNode = rootNode; 
	}

	public TreeNode getRootNode(){
		return this.rootNode;
	}

	public boolean isTreeEmpty(){
		return (this.rootNode==null)?true:false;
	}

	public int getReminder(int data){

		int reminder = -1;

		for(int i = 2; i <= 10 ; i++ ){
			if((data % 10) == i){
				reminder = i;
				break;
			}
		}

		if(reminder == -1){
			reminder = 1; 
		}
		return reminder;
	}

	public int getLength(int data){
		int length = 1;
		while(true){
			if((data / 10) > 0){
				length++;
				data /= 10;
			}
			else{
				break;
			}
		}
		return length;
	}

	public void insertRecursive(int data, TreeNode treeNode) {

		int reminder = getReminder(data);
		
		List<TreeNode> childNode = treeNode.getChildNodes();
		
		// do not insert same data into the tree
		if(treeNode.getData() == data){
			return;
		}
		int level = 1;
		if(null != childNode){
			for(TreeNode child: childNode){
				// child.getData()) == reminder to find parent hierarchy of data
				if(getReminder(child.getData()) == reminder){
					insertRecursive(data, child);
					level++;
				}
			}
		}

		if(childNode == null){
			TreeNode newChildNode = new TreeNode(data);
			childNode = new ArrayList<TreeNode>();
			childNode.add(newChildNode);
			treeNode.setChildNodes(childNode);
			return;
		}
		
		if(level == 1 ){
			TreeNode newChildNode = new TreeNode(data);
			childNode.add(newChildNode);
			return;
		}
	}
	public void insertData(int data){

		if(isTreeEmpty()){
			setRootNode(new TreeNode(1));
		}

			TreeNode currentNode = getRootNode();

			insertRecursive(data, currentNode);
	}

	public TreeNode remove(){
		TreeNode treeNode = new TreeNode();

		return treeNode;
	}

	public void recursiveTraverse(TreeNode treeNode, int level){
		System.out.println(treeNode.getData() + " --- " + level);
		List<TreeNode> childNodes = treeNode.getChildNodes();
		if(null == childNodes){
			return;
		}
		else{
			level++;
			for(TreeNode child: childNodes){
				recursiveTraverse(child, level);
			}
		}
	}
	
	public void traverse(){
		
		TreeNode currentNode = getRootNode();

		int level = 1;
		if(null != currentNode){
			recursiveTraverse(currentNode, level);
		}else{
			System.out.println("Tree is empty");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treev1 treev1 = new Treev1();
		treev1.insertData(2);
		treev1.insertData(3);
		treev1.insertData(4);
		treev1.insertData(5);
		treev1.insertData(6);
		treev1.insertData(7);
		treev1.insertData(8);
		treev1.insertData(22);
		treev1.insertData(244);
		treev1.insertData(244);
		treev1.insertData(244);
		treev1.insertData(244);
		treev1.insertData(4);		
		treev1.insertData(12314);
		
		treev1.traverse();
		/*		int data = 1233;
		System.out.println(treev1.getReminder(data));
		System.out.println(treev1.getLength(data));
		 */		
	}

}
