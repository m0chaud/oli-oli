package com.compit.programming.basics.datatype;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: chaudharimehul
 * @date:	Jul 3, 2017
 * 
 */
public class JavaCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack<Integer> stack = new Stack<Integer>();
	Scanner in = new Scanner(System.in);
	stack.push(in.nextInt());
	stack.push(in.nextInt());
	
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.pop());	
	System.out.println(Integer.MIN_VALUE);	
	}

}
