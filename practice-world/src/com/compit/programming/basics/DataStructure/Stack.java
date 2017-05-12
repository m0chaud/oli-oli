package com.compit.programming.basics.DataStructure;

import java.util.Scanner;

/**
 * @author chaudharimehul
 *
 */
public class Stack {

	Scanner userIntput = new Scanner(System.in);
	int top = -1;
	int stack[];
	int stackSize;

	public Scanner getUserIntput() {
		return userIntput;
	}

	public void setUserIntput(Scanner userIntput) {
		this.userIntput = userIntput;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}
	
	public boolean isFull(){
		if(top == (stackSize-1)){
			return true;
		}else{
			return false;
		}
	}

	public void pushElement(int pushElement){
		if(isFull()){
			System.out.println("Stack is full cannot input more elements");
		}else{
			stack[++top] = pushElement;
		}
	}

	public boolean isEmpty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	public void popElement(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{
			System.out.println(stack[top--]);
		}
	}

	public void peekElement(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{
			System.out.println(stack[top]);
		}
	}

	public void traverseStack(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{

			for (int i = top; i >= 0; i--) {
				System.out.print(stack[i]+"<--");
			}
			System.out.println("");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stackObj = new Stack();
		System.out.println("Enter the Size of the Stack");
		stackObj.setStackSize(stackObj.getUserIntput().nextInt());
		stackObj.setStack(new int[stackObj.getStackSize()]);

		while(true){
			System.out.println("Enter Choice to For operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Traverse");
			System.out.println("5. Exit");

			int choice = stackObj.getUserIntput().nextInt();


			switch (choice) {
			case 1:
				System.out.println("Enter the value to Push");
				stackObj.pushElement(stackObj.getUserIntput().nextInt());
				stackObj.traverseStack();
				break;
			case 2:
				System.out.println("Poped Value");
				stackObj.popElement();
				stackObj.traverseStack();
				break;
			case 3:
				System.out.println("Peeked Value");
				stackObj.peekElement();
				break;
			case 4:
				System.out.println("Stack Traverse");
				stackObj.traverseStack();
				break;
			case 5:
				System.out.println("Exiting From Stack");
				System.exit(1);
				break;

			default:
				break;
			}
		}
	}

}
