package com.compit.programming.basics.datastructure;

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

	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#pop()
	 */
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#peek()
	 */
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.compit.programming.basics.datastructure.Stack#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
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
