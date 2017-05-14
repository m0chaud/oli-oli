package com.compit.programming.basics.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 * @author chaudharimehul
 *
 * This program is to solve one of the 10-day statistics challenge from hacker rank
 * https://www.hackerrank.com/challenges/s10-basic-statistics
 */
public class MeanMedianMode {

	public static void main(String[] args) {

		Scanner userInput2 = new Scanner(System.in);
		int numOfInt = userInput2.nextInt();

		List<Integer> arrayList = new ArrayList<Integer>();
		Map<Integer,Integer> modMap2 = new HashMap<Integer, Integer>();

		float mean2 = 0.0f;
		Integer mode2 = Integer.MIN_VALUE;
		float median2 = 0.0f;
		int val2;
		Integer maxCount = 1 ;
		for(int i = 0 ; i < numOfInt ; i++){
			val2 = userInput2.nextInt();
			arrayList.add(val2);
			mean2 = mean2+val2;

			if(modMap2.containsKey(val2)){
				Integer count2 = modMap2.get(val2);
				count2++;
				if(count2 == maxCount){
					if(val2 < mode2){
						mode2 = val2;
					}
				}else if(count2 > maxCount){
					maxCount = count2;
					mode2 = val2;
				}
				modMap2.put(val2, count2);
			}
			else{
				modMap2.put(val2, 1);
			}
		}
		mean2 = (float) mean2 / arrayList.size();
		Collections.sort(arrayList);
		if(arrayList.size() %2 == 1){
			median2 = arrayList.get(arrayList.size()/2);
		}else{
			median2 = (float)(arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2 -1)) / 2;
		}

		if(maxCount == 1) {
			mode2 = arrayList.get(0);
		}

		userInput2.close();
		System.out.printf("%.1f\n",mean2);
		System.out.printf("%.1f\n",median2);
		System.out.println(mode2);
	}
}