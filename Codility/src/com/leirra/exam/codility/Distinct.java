package com.leirra.exam.codility;

import java.util.Arrays;

public class Distinct {

	public static void main(String[] args) {
		int[] a = {2,1,1,2,3,1};
		Distinct d = new Distinct();
		System.out.println("The number of distinct values in "+Arrays.toString(a)+" is: "+d.solution(a) );
	}

	public int solution(int[] A) {
		int length = A.length;
		int inputLimit = 1000000;
		int[] positives = new int[inputLimit];
		int[] negatives = new int[inputLimit]; // should be length - 1 not counting zero
		for (int element : A) {
			if (element >= 0) {
				++positives[element];
			} else {
				int abs = element * -1;
				++negatives[abs];
			}
		}
		int countDistincts = 0;
		for (int i : A) {
			if (i >= 0) {
				if (positives[i] >= 1) {
					++countDistincts;
					positives[i] = 0;
				}
			} else {
				if (negatives[i * -1] >= 1) {
					++countDistincts;
					negatives[i * -1] = 0;
				}
			}
		}
		return countDistincts;
	}
}
