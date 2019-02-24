package com.leirra.exam.codility;

import java.util.Arrays;

public class MaxCounter {
	public static void main(String[] args) {
		int j = 5;
		int[] k = new int[] { 3, 4, 4, 6, 1, 4, 4 };
		MaxCounter m = new MaxCounter();
		System.out.println(
				"Counter: " + j + "\nArray: " + Arrays.toString(k) + "\nOutput: " + Arrays.toString(m.solution(j, k)));
	}
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int maxAIs = 0;
		int minAShouldBe = 0;
		for (int x : A) {
			if (x >= 1 && x <= N) {
				if (counters[x - 1] < minAShouldBe) {
					counters[x - 1] = minAShouldBe;
				}
				counters[x - 1]++;
				if (counters[x - 1] > maxAIs) {
					maxAIs = counters[x - 1];
				}
			} else if (x == N + 1) {
				minAShouldBe = maxAIs;
			}
		}
		for (int i = 0; i < N; i++) {
			if (counters[i] < minAShouldBe) {
				counters[i] = minAShouldBe;
			}
		}
		return counters;
	}
}