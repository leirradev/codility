package com.leirra.exam.codility;

import java.util.Arrays;

public class ArrayInversionCount {

	public static void main(String[] args) {
		ArrayInversionCount b = new ArrayInversionCount();
		int[] a = {-1,6,3,4,7,4};
		System.out.println("The number of inversions in\n"+Arrays.toString(a)+"\nis: "+b.solution(a));
	}

	public int solution(int[] A) {
		int inversionCount = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					inversionCount++;
				}
			}
		}
		return inversionCount;
	}
}
