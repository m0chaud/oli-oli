package com.compit.programming.basics.datastructure;

import java.util.Scanner;

/**
 * @author: chaudharimehul
 * @date:	May 14, 2017
 * 
 */
public class Stackv1 {

	Node topNode = null;
	
	public void setTopNode(Node topNode){
		this.topNode = topNode;
	}
	
	public Node getTopNode(){
		return topNode;
	}
	
	public void push(int data){
		
		Node node = new Node(data);
		
/*		if(isEmpty())
		{
			setTopNode(node);
			return;
		}
*/		
		node.setNext(peek());
		setTopNode(node);
	}
	
	//returning Node itself instead of data, to get more control over
	//data getting returned to service method
	public Node pop(){
		
		if(isEmpty())
			return null;
		
		Node node = getTopNode();
		setTopNode(node.getNext());
		return node;
	}
	
	public Node peek(){
		return getTopNode();
	}
	
	public void traverse(){
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return;
		}
		Node currentNode = getTopNode();
		while(currentNode != null){
			System.out.print(currentNode.getData() + " --> " );
			currentNode = currentNode.getNext();
		}
	}
	public boolean isEmpty(){
		if(null == topNode)
			return true;
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Stackv1 stack = new Stackv1();
		System.out.println("Enter Choice as below");
		System.out.println("1. Push to the stack. Enter -99 to stop from push operation.");
		System.out.println("2. Pop from the stack.");
		System.out.println("3. Peek from the stack.");
		System.out.println("4. Traverse the stack.");
		System.out.println("5. Exit.");
		
		int choice;
		boolean bExitFlag = false;
		int data;
		while(!bExitFlag){
			choice = in.nextInt();
			switch(choice){
			case 1:
				data = in.nextInt();
				while(data != -99){
					stack.push(data);
					data = in.nextInt();
				}
				break;
			case 2:
				Node popNode = stack.pop();
				if(null != popNode)
					System.out.println("Pop element value -- " + popNode.getData());
				else
					System.out.println(" Stack is empty. ");
				break;
			case 3:
				Node peekNode = stack.peek();
				if(null != peekNode)
					System.out.println("Peek element value -- "+ peekNode.getData());
				else
					System.out.println(" Stack is empty. ");
				break;
			case 4:
				stack.traverse();
				break;
			case 5:
				bExitFlag = true;
				break;
			default:
				break;
			}
		}
		in.close();
	}

}
