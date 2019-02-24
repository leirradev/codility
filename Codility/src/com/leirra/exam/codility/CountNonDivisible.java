package com.leirra.exam.codility;

import java.util.Arrays;

public class CountNonDivisible {

	public static void main(String[] args) {
		CountNonDivisible c = new CountNonDivisible();
		int[] j = {3,1,2,3,6};
		System.out.println("Number of elements in array is "+j.length+" from "+Arrays.toString(j)
		+"\nThe number of its non-divisors respectively is: " + Arrays.toString(c.solution(j)));
	}

	public int[] solution(int[] A) {
		int[] counts = new int[A.length * 2 + 1];
		for (int number : A) {
			counts[number]++;
		}
		int[] divisorNums = new int[counts.length];
		for (int i = 1; i * i < divisorNums.length; i++) {
			for (int j = i * i; j < divisorNums.length; j += i) {
				divisorNums[j] += counts[i];
				if (j != i * i) {
					divisorNums[j] += counts[j / i];
				}
			}
		}
		int[] result = new int[A.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = A.length - divisorNums[A[i]];
		}
		return result;
	}
}
