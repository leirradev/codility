package com.leirra.exam.codility;

import java.util.Arrays;

public class MissingInteger {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3 ,4,1,2,3,5};
		MissingInteger g = new MissingInteger();
		System.out.println("The next positive integer of array in " + Arrays.toString(x) + " is: " + g.sasa(x));
	}
	public int sasa(int A[]) {
		int N = A.length;
		int[] hashed = new int[N];
		for (int i : A) {
			if (i > 0 && i <= N)
				hashed[i - 1] = 1;
		}
		for (int i = 0; i < N; i++)
			if (hashed[i] == 0) {
				return i + 1;
			}
		return N + 1;
	}
}