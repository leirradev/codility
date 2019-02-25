package com.leirra.exam.codility;

import java.util.Arrays;

public class AbsDistinct {

	public static void main(String[] args) {
		AbsDistinct a = new AbsDistinct();
		int[] b = {-5, -3, -1, 0, 3, 6};
		System.out.println("The absolute distinct count for "+Arrays.toString(b)
		+" is: "+a.solution(b));
	}

	public int solution(int[] A) {
		int N = A.length;
		int head = 0;
		int tail = N - 1;
		int result = 1;
		int currMaxValue = Math.max(Math.abs(A[head]), Math.abs(A[tail]));
		if (A[head] == Integer.MIN_VALUE)
			currMaxValue = Math.abs(A[head]);
		while (head <= tail) {
			int currHead = Math.abs(A[head]);
			if (currHead == currMaxValue) {
				head++;
				continue;
			}
			int currTail = Math.abs(A[tail]);
			if (currTail == currMaxValue) {
				tail--;
				continue;
			}
			if (currHead >= currTail) {
				currMaxValue = currHead;
				head++;
			} else {
				currMaxValue = currTail;
				tail--;
			}
			result++;
		}
		return result;
	}
}
