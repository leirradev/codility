package com.leirra.exam.codility;

import java.util.Arrays;

public class OddOccurencesInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[] { 1, 1, 2, 3, 2, 3, 5 };
		OddOccurencesInArray o = new OddOccurencesInArray();
		System.out.println("The unpaired element in array " + Arrays.toString(x) + " is: " + o.solution(x));
	}
	public int solution(int[] A) {
		// int solution = 0;
		// for (int value: A)
		// solution ^= value;
		// return solution;
		int unPairedNum = A[0];
		for (int i = 1; i < A.length; i++)
			unPairedNum = unPairedNum ^ A[i];
		return unPairedNum;
	}
}