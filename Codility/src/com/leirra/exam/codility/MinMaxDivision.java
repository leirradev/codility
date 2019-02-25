package com.leirra.exam.codility;

import java.util.Arrays;

public class MinMaxDivision {

	public static void main(String[] args) {
		MinMaxDivision m = new MinMaxDivision();
		int[] a = {3, 1, 5, 1, 2, 2, 3};
		int j=3, k=5;
		System.out.println("The minimal largest sum for ("+j+", "+k+", "+Arrays.toString(a)
		+")\nfor "+j+" is the min and "+k +" is the max for each element in array"
		+"\nis: " +m.solution(j, k, a));
	}

	public int solution(int K, int M, int[] A) {
		long N = (long) A.length;
		long max = N * M;
		long min = 0;
		long result = 0;
		while (min <= max) {
			long mid = (min + max) / 2;
			int count = 0;
			long sum = 0;
			for (long ele : A) {
				sum += ele;
				if (ele > mid) {
					count = K + 1;
					break;
				}
				if (sum > mid) {
					count++;
					sum = ele;
				}
			}
			count++;
			if (count <= K) {
				max = mid - 1;
				result = mid;
			} else {
				min = mid + 1;
			}
		}
		return (int) result;
	}
}
