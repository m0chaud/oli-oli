package com.compit.programming.basics.datastructure;

import com.compit.programming.basics.datastructure.GenericNode;
import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class LinkedListv2<T> implements LinkedList<T> {

	GenericNode<T> headNode;

	@Override
	public boolean isEmpty(){

		boolean isEmpty = false;

		if(headNode == null){
			System.out.println(" -- Empty List found ---");
			isEmpty = true;
		}
		return isEmpty;
	}
	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#insert(java.lang.Object)
	 */
	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		GenericNode<T> node = new GenericNode<T>();
		node.setData(data);

		if(isEmpty()){
			System.out.println(" -- Inserting head node -- ");
			setHeadNode(node);
		}else{
			GenericNode<T> currentNode = getHeadNode();

			while(currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(node);
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> currentNode = getHeadNode();
			while(currentNode != null){
				System.out.print(" --> " + currentNode.getData());
				currentNode = currentNode.getNextNode();
			}
			System.out.println("");
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#deleteAtHead()
	 */
	@Override
	public void deleteAtHead() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> currentNode = getHeadNode();
			System.out.println(" -- Removed Head Node with value --> " + currentNode.getData());
			setHeadNode(currentNode.getNextNode());
			currentNode = null;
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#deleteAtTail()
	 */
	@Override
	public void deleteAtTail() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> currentNode = getHeadNode();
			GenericNode<T> prevNode = getHeadNode();
			while(currentNode.getNextNode() != null){
				prevNode = currentNode;
				currentNode = currentNode.getNextNode();
			}

			System.out.println(" -- Removed Tail Node with value --> " + currentNode.getData());

			if(currentNode == getHeadNode()){
				setHeadNode(null);	
			}else{
				prevNode.setNextNode(null);
				currentNode = null;
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#deleteAllNodes()
	 */
	@Override
	public void deleteAllNodes() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> currentNode = getHeadNode();
			GenericNode<T> prevNode = getHeadNode();
			while(currentNode != null){
				prevNode = currentNode;
				currentNode = currentNode.getNextNode();
				prevNode = null;	
			}
		}
		setHeadNode(null);
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#initializeDefaultList()
	 */
	@Override
	public void initializeDefaultList() {
		// TODO Auto-generated method stub
		deleteAllNodes();
		
		for(int i = 10 ; i >= 0 ; i--){
			T data = (T) new Integer(i) ;
			insert(data);
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#setHeadNode(com.compit.programming.basics.datastructure.GenericNode)
	 */
	@Override
	public void setHeadNode(GenericNode<T> headNode) {
		// TODO Auto-generated method stub
		this.headNode = headNode;
	}
	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.LinkedList#getHeadNode()
	 */
	@Override
	public GenericNode<T> getHeadNode() {
		// TODO Auto-generated method stub
		return this.headNode;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListv2<String> linkedList = new LinkedListv2<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Select below option to perform action on Linked List");
		System.out.println("1. To insert data in to Linked List");
		System.out.println("2. To delete data at head in to Linked List");
		System.out.println("3. To delete data at tail in to Linked List");
		System.out.println("4. To print data from start index in to Linked List");
		System.out.println("5. To print data from end index in to Linked List");
		System.out.println("6. To print Linked List");
		System.out.println("7. To Initialize default Linked List");
		System.out.println("8. Exit");

		//System.out.println(" Default link list ");
		//linkedList.initializeDefaultList();
		//linkedList.print();
		
		int option;
		boolean readOption = true;
		String data;
		int index;
		while(readOption){
			System.out.println(" Select an option ");
			option = in.nextInt();

			switch(option){
			case 1:
				in.nextLine();
				System.out.println("-> Enter value for Node");
				data = in.nextLine();
				linkedList.insert(data);
				linkedList.print();
				System.out.println("->-<-");
				break;
			case 2:
				linkedList.deleteAtHead();
				linkedList.print();
				System.out.println("->-<-");					
				break;
			case 3:
				linkedList.deleteAtTail();
				linkedList.print();
				System.out.println("->-<-");					
				break;
			case 4:
				System.out.println("-> Enter index from start");
/*				index = in.nextInt();
				data = linkedList.printFromStartIndex(index);
				if(data != -9999){
					System.out.println("Print node value from start index " + index + " - " + data);
					linkedList.print();
				}
*/
				System.out.println("->-<-");					
				break;
			case 5:
				System.out.println("-> Enter index from end");
/*				index = in.nextInt();
				data = linkedList.printFromEndIndex(index);
				if(data != -9999){
					System.out.println("Print node value from end index " + index + " - " + data);
					linkedList.print();
				}
*/				System.out.println("->-<-");					
				break;
			case 6:
				linkedList.print();
				System.out.println("->-<-");
				break;
			case 7:
				linkedList.initializeDefaultList();
				linkedList.print();
				break;
			case 8:
				readOption = false;
				break;
			default:
				System.out.println("-> Enter Valid Option");
				break;

			}
		}

		in.close();
	}


}
