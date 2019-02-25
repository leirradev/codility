package com.leirra.exam.codility;

import java.util.Arrays;

public class MinAbsSumOfTwo {

	public static void main(String[] args) {
		MinAbsSumOfTwo m = new MinAbsSumOfTwo();
		int[] a= {-8,4,5,-10,3};
		System.out.println("The minimal absolute sum of two in "+Arrays.toString(a)
		+"\nis:"+m.solution(a));
	}

	public int solution(int[] A) {
		int len = A.length;
		int min = 0;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				sum = Math.abs(A[i] + A[j]);
				if (i == 0 && j == 0)
					min = sum;
				else {
					if (min > sum)
						min = sum;
				}
			}
		}
		return min;
	}
}
