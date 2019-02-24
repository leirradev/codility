package com.leirra.exam.codility;

import java.util.Arrays;

public class CyclicRotation {
	public static void main(String[] args) {
		CyclicRotation c = new CyclicRotation();
		int j = 3;
		int[] i = new int[] { 3, 8, 9, 7, 6 };
		System.out.println("Array: " + Arrays.toString(i) + "\nNew starting index in array:" + j + "\n"
				+ Arrays.toString(c.solution(i, j)));
	}
	public int[] solution(int[] A, int K) {
		if (A == null)
			return null;
		int arrayLength = A.length;
		int[] sol = new int[A.length];
		for (int i = 0; i < A.length; i++)
			sol[(i + K) % arrayLength] = A[i];
		return sol;
	}
}