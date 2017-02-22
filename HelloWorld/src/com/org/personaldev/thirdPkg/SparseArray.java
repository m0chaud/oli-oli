package com.org.personaldev.thirdPkg;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner userInput = new Scanner(System.in);
		int numberOfString = userInput.nextInt();
		String inputStrs[] = new String[numberOfString];

		userInput.nextLine();

		for(int i = 0 ; i < numberOfString ; i++){
			inputStrs[i] = userInput.nextLine();
		}


		int numberOfQueries = userInput.nextInt();
		String matchQueries[] = new String[numberOfQueries];

		userInput.nextLine();
		for(int i = 0 ; i < numberOfQueries ; i++){
			matchQueries[i] = userInput.nextLine();
			int matchCount = 0;
			for(int k = 0 ; k < numberOfString ; k++){
				if(inputStrs[k].equals(matchQueries[i])){
					matchCount++;
				}
			}
			System.out.println(matchCount);
		}
		userInput.close();
	}
}