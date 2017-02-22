package com.org.personaldev.thirdPkg;

import java.util.Scanner;


/**
 * @author chaudharimehul
 * 
 * This program is to solve one of the 30-day challenge from hacker rank
 * https://www.hackerrank.com/challenges/linkedin-practice-array-left-rotation
 *
 */
public class LeftRotateArray {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner userInput = new Scanner(System.in);
		int numberOfInt = userInput.nextInt();
		int numOfLeftRotation = userInput.nextInt();

		int intArray[] = new int[numberOfInt];
		
		int resultAfterRotation[] = new int[numberOfInt];
		for(int i = 0 ; i < numberOfInt ; i++){
			intArray[i] = userInput.nextInt();
		}
		for(int k = 0; k < numOfLeftRotation ; k++){
			int temp = intArray[0];
			for(int i = 0 ; i < numberOfInt - 1 ; i++){
				resultAfterRotation[i] = intArray[i+1];    
			}
			resultAfterRotation[numberOfInt-1] = temp;
			intArray = resultAfterRotation;
		}
		for(int i : resultAfterRotation){
			System.out.print(i+" ");
		}
		
		userInput.close();
	}
}