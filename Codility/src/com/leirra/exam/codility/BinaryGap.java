package com.leirra.exam.codility;

public class BinaryGap {
	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		int j = 3;
		System.out.println("The longest zeros of " + j + " when converted to binary is: " + b.solution(j));
	}
	public int solution(int N) {
		int binaryGap = 0;
		while (N % 2 == 0)
			N /= 2;
		for (int j = 0; N > 0; N /= 2) {
			if (N % 2 == 0) {
				j++;
			} else {
				if (j > binaryGap) {
					binaryGap = j;
				}
				j = 0;
			}
		}
		return binaryGap;
	}
}