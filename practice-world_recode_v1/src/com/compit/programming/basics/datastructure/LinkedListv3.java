package com.compit.programming.basics.datastructure;

/**
 * @author: chaudharimehul
 * @date:	Sep 3, 2017
 * 
 */
public class LinkedListv3 {

	public void reversePrint(GenericNode<Integer> headNode){
		
		if(headNode == null)
			return;
			
		reversePrint(headNode.getNextNode());
		
		System.out.print(" --> " + headNode.getData());
		
	}

	public GenericNode<Integer> reverseLinkedList(GenericNode<Integer> headNode){
		
		if(headNode == null)
			return null;
		if(headNode != null && headNode.getNextNode() == null)
			return headNode;
			
		GenericNode<Integer> prevNode = reverseLinkedList(headNode.getNextNode());
		
		prevNode.setNextNode(headNode);
		headNode.setNextNode(null);
		
		return prevNode;
		
	}
		
	public GenericNode<Integer> deleteEvenNode(GenericNode<Integer> headNode){
		//GenericNode<Integer> headNode = new GenericNode<Integer>();

		GenericNode<Integer> currentNode = headNode;
		GenericNode<Integer> prevNode = headNode;
		while(currentNode != null){

			prevNode = currentNode;
			currentNode = currentNode.getNextNode();
			//boolean isHeadNode = false;

			while(currentNode != null){
				//System.out.println(currentNode.getData());
				//isHeadNode = false;
				if (currentNode.getData() % 2 == 0 ){
					//System.out.println("even value"+currentNode.getData());
					currentNode = currentNode.getNextNode();
				}
				else{
					break;
				}			
			}

			if(headNode.getData() % 2  == 0){
				headNode = currentNode;
			}
			else{
				prevNode.setNextNode(currentNode);
			}
		}
		return headNode;
	}
	
	public GenericNode<Integer> deleteOddNode(GenericNode<Integer> headNode){
		//GenericNode<Integer> headNode = new GenericNode<Integer>();

		GenericNode<Integer> currentNode = headNode;
		GenericNode<Integer> prevNode = headNode;
		while(currentNode != null){

			prevNode = currentNode;
			currentNode = currentNode.getNextNode();
			//boolean isHeadNode = false;

			while(currentNode != null){
				//System.out.println(currentNode.getData());
				//isHeadNode = false;
				if (currentNode.getData() % 2 != 0 ){
					//System.out.println("even value"+currentNode.getData());
					currentNode = currentNode.getNextNode();
				}
				else{
					break;
				}			
			}

			if(headNode.getData() % 2  != 0){
				headNode = currentNode;
			}
			else{
				prevNode.setNextNode(currentNode);
			}
		}
		return headNode;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListv2<Integer> linkedListv2 = new LinkedListv2<Integer>();
		LinkedListv3 linkedListv3 = new LinkedListv3();

		
		linkedListv2.initializeDefaultList();
		System.out.println( "After initializing list" );
		linkedListv2.print();

		//Delete even node
		linkedListv2.setHeadNode( linkedListv3.deleteEvenNode(linkedListv2.getHeadNode()) );
		System.out.println("After deleting even node");
		linkedListv2.print();

		//Delete odd node
		linkedListv2.setHeadNode( linkedListv3.deleteOddNode(linkedListv2.getHeadNode()) );
		System.out.println("After deleting odd node");		
		linkedListv2.print();

		linkedListv2.initializeDefaultList();
		System.out.println( "After initializing list" );
		linkedListv2.print();

		//Delete odd node
		linkedListv2.setHeadNode( linkedListv3.deleteOddNode(linkedListv2.getHeadNode()) );
		System.out.println("After deleting odd node");		
		linkedListv2.print();
	
		System.out.println("Reverse Print the Singly Linked list");
		linkedListv3.reversePrint( linkedListv2.getHeadNode() );
		System.out.println();

		System.out.println("Reverse the Singly Linked list");
		linkedListv2.setHeadNode( linkedListv3.reverseLinkedList( linkedListv2.getHeadNode() ) );
		System.out.println();

	}

}
