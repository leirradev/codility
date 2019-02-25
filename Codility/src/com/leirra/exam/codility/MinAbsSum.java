package com.leirra.exam.codility;

import java.util.Arrays;

public class MinAbsSum {

	public static void main(String[] args) {
		MinAbsSum m = new MinAbsSum();
		int[] i = { 1, 5, 2, -2 };
		System.out.println("The minimal absolute sum from " + Arrays.toString(i) + " is: " + m.solution(i));
	}

	public int solution(int[] A) {
		if (A.length == 0)
			return 0;
		int sum = 0;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0)
				A[i] = -A[i];
			sum += A[i];
		}
		int target = sum / 2;
		int dp[][] = new int[A.length][target];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < target; j++) {
				if (i == 0) {
					if (A[i] <= (j + 1)) {
						dp[i][j] = A[i];
					} else {
						dp[i][j] = 0;
					}
				} else {
					int w1 = dp[i - 1][j];
					int w2 = 0;
					if (j - A[i] >= 0) {
						w2 = dp[i][j - A[i]] + A[i];
					}
					dp[i][j] = w1 > w2 ? w1 : w2;
				}
			}
		}
		max = dp[A.length - 1][target - 1];
		return (sum - max * 2);
	}
}
