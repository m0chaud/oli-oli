package com.compit.programming.basics.datastructure;

import java.util.Random;

/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class QueueImpl<T> implements Queue<T> {

	GenericNode<T> headNode;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		QueueImpl<Integer> queue = new QueueImpl<Integer>();

		for(int i = 0 ; i < 10 ; i++){
			queue.add(r.nextInt(500));	
		}
		
		System.out.println(" <- default initialized queue print -> ");
		
		queue.print();
		
		System.out.println(" ------------------------------------- ");
		
		System.out.println(" <- remove first 3 entry from queue -> ");
		
		for( int i = 0 ; i < 3 ; i ++){
			queue.remove();
		}
		
		System.out.println(" <- queue print after 3 node removed -> ");
		
		queue.print();

		System.out.println(" ------------------------------------- ");
		
		System.out.println(" <- peak first 3 entry from queue -> ");
		
		for( int i = 0 ; i < 3 ; i ++){
			queue.peek();
		}
		
		System.out.println(" <- queue print after 3 node Peek -> ");	
		queue.print();
		System.out.println(" ------------------------------------- ");	
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Queue#add(java.lang.Object)
	 */
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		GenericNode<T> node = new GenericNode<T>(data);
		if(!isEmpty()){
			GenericNode<T> currentNode = getHeadNode();
			while(currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(node);
		}else{
			setHeadNode(node);
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Queue#remove()
	 */
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		T data = null;
		
		if(!isEmpty()){		
			GenericNode<T> node = getHeadNode();
			data = node.getData();
			setHeadNode(node.getNextNode());
			node = null;
		}else{
			System.out.println(QueueImpl.class.getName() + " is Empty ");	
		}		
		return data;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Queue#peek()
	 */
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T data = null;
		if(!isEmpty()){
			data = getHeadNode().getData();
		}
		return data;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Queue#print()
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

		}else{
			System.out.println(QueueImpl.class.getName() + " is Empty ");
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Queue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (getHeadNode() == null)? true:false;
	}

	public GenericNode<T> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(GenericNode<T> headNode) {
		this.headNode = headNode;
	}

}
