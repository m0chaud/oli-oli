package com.compit.programming.basics.datastructure;

import java.util.Random;
/**
 * @author: chaudharimehul
 * @date:	Sep 1, 2017
 * 
 */
public class StackImpl<T> implements Stack<T>{

	GenericNode<T> headNode;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		StackImpl<Integer> queue = new StackImpl<Integer>();

		for(int i = 0 ; i < 10 ; i++){
			queue.push(r.nextInt(500));	
		}
		
		System.out.println(" <- default initialized Stack print -> ");
		
		queue.print();
		
		System.out.println(" ------------------------------------- ");
		
		System.out.println(" <- Pop first 3 entry from Stack -> ");
		
		for( int i = 0 ; i < 3 ; i ++){
			queue.pop();
		}
		
		System.out.println(" <- Stack print after 3 node removed -> ");
		
		queue.print();

		System.out.println(" ------------------------------------- ");
		
		System.out.println(" <- peak first 3 entry from Stack -> ");
		
		for( int i = 0 ; i < 3 ; i ++){
			queue.peek();
		}
		
		System.out.println(" <- Stack print after 3 node Peek -> ");	
		queue.print();
		System.out.println(" ------------------------------------- ");	
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
		
		GenericNode<T> node = new GenericNode<T>(data);
		System.out.println(" Push --> " + data);		
		if(!isEmpty()){
			node.setNextNode(getHeadNode());
			setHeadNode(node);
		}
		else{
			setHeadNode(node);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#pop()
	 */
	@Override
	public T pop() {
		T data = null;
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> node = getHeadNode();
			data = node.getData();
			setHeadNode(node.getNextNode());
			node = null;
		}
		return data;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#peek()
	 */
	@Override
	public T peek() {
		T data = null;
		// TODO Auto-generated method stub
		if(!isEmpty()){
			GenericNode<T> node = getHeadNode();
			data = node.getData();
		}
		return data;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(!isEmpty()){

			GenericNode<T> currentNode = getHeadNode();

			while(currentNode != null){
				if(currentNode == getHeadNode()){
					System.out.print(" --> " + currentNode.getData() + " (head) ");
				}
				else{
					System.out.print(" --> " + currentNode.getData());
				}

				currentNode = currentNode.getNextNode();
			}
			System.out.println("");

		}else{
			System.out.println(QueueImpl.class.getName() + " is Empty ");
		}
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (getHeadNode() == null)?true:false;
	}

	public GenericNode<T> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(GenericNode<T> headNode) {
		this.headNode = headNode;
	}

}
