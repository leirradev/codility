package com.leirra.exam.codility;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSemiPrimes {

	public static void main(String[] args) {
		CountSemiPrimes c = new CountSemiPrimes();
		int i = 26;
		int[] j = { 1, 4, 16 }, k = { 26, 10, 20 };
		System.out.println("The semi prime number of "+i+ " ranges in two arrays respectively\n"
				+Arrays.toString(j)+",\n"+Arrays.toString(k)
				+"\nis: " + Arrays.toString(c.solution(i, j, k)));
	}

	public int[] solution(int N, int[] P, int[] Q) {
		ArrayList<Integer> semiprimes = new ArrayList<Integer>();
		int[] results = new int[P.length];
		if (N < 4) {
		} else {
			for (int i = 2; i <= N; i++) {
				int semiprimesCount = 0;
				for (int j = 1; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						semiprimesCount++;
					}
				}
				if (semiprimesCount == 2) {
					boolean isSecond = true;
					for (int k = 0; k < semiprimes.size(); k++) {
						if (i % semiprimes.get(k) == 0) {
							isSecond = false;
							break;
						}
					}
					if (isSecond) {
						// System.out.println("Semiprimes "+ i);
						semiprimes.add(i);
					}
				}
			}
			int[] preSum = new int[N + 1];
			int semiprimesIndex = 0;
			for (int i = 0; i < N + 1; i++) {
				if (semiprimesIndex < semiprimes.size()) {
					if (semiprimes.get(semiprimesIndex) == i) {
						// System.out.println("Semiprimes "+ semiprimes.get(semiprimesIndex));
						preSum[i] = 1;
						semiprimesIndex++;
					}
				}
				if (i > 0) {
					preSum[i] = preSum[i] + preSum[i - 1];
				}
				// System.out.println("Index "+i+":"+ preSum[i]);
			}
			for (int i = 0; i < P.length; i++) {
				results[i] = preSum[Q[i]] - preSum[P[i] - 1];
			}
		}
		return results;
	}
}
