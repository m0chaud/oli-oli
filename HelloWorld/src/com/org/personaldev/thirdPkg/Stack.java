package com.org.personaldev.thirdPkg;

import java.util.Scanner;

public class Stack {

	static Scanner userIntput = new Scanner(System.in);
	static int top = -1;
	static int stack[];
	static int stackSize;

	public static boolean isFull(){
		if(top == (stackSize-1)){
			return true;
		}else{
			return false;
		}
	}

	public static void push(int pushElement){
		if(isFull()){
			System.out.println("Stack is full cannot input more elements");
		}else{
			stack[++top] = pushElement;
		}
	}

	public static boolean isEmpty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	public static void pop(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{
			System.out.println(stack[top--]);
		}
	}

	public static void peek(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{
			System.out.println(stack[top]);
		}
	}

	public static void traverse(){
		if(isEmpty()){
			System.out.println("No More element is stack");
		}else{

			for (int i = top; i >= 0; i--) {
				System.out.print("|"+stack[i]);
			}
			System.out.println("|");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Size of the Stack");
		stackSize = userIntput.nextInt();
		stack = new int[stackSize];

		while(true){
			System.out.println("Enter Choice to For operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Traverse");
			System.out.println("5. Exit");

			int choice = userIntput.nextInt();


			switch (choice) {
			case 1:
				System.out.println("Enter the value to Push");
				push(userIntput.nextInt());
				break;
			case 2:
				System.out.println("Poped Value");
				pop();
				break;
			case 3:
				System.out.println("Peeked Value");
				peek();
				break;
			case 4:
				System.out.println("Stack Traverse");
				traverse();
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
