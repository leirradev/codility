package com.leirra.exam.codility;

import java.util.Arrays;

public class CommonPrimeDivisors {

	public static void main(String[] args) {
		CommonPrimeDivisors c = new CommonPrimeDivisors();
		int[] a = {15,10,100}, b = {75,30,3};
		System.out.println("The number of prime divisors between\n"+Arrays.toString(a)+" and\n"+Arrays.toString(b)
		+"\nrespectively is: "+c.solution(a, b));
	}

	public int solution(int[] A, int[] B) {
		int Z = A.length;
		int count = 0;
		for (int i = 0; i < Z; i++) {
			int a = A[i];
			int b = B[i];
			int gcdOfBoth = gcd(a, b);
			int divisorOfA = a / gcdOfBoth;
			int gcdOfA = gcd(gcdOfBoth, divisorOfA);
			while (gcdOfA != 1) {
				divisorOfA /= gcdOfA;
				gcdOfA = gcd(gcdOfBoth, divisorOfA);
			}
			int divisorOfB = b / gcdOfBoth;
			int gcdOfB = gcd(gcdOfBoth, divisorOfB);
			while (gcdOfB != 1) {
				divisorOfB /= gcdOfB;
				gcdOfB = gcd(gcdOfBoth, divisorOfB);
			}
			if (divisorOfA == 1 && divisorOfB == 1)
				count++;
		}
		return count;
	}

	public int gcd(int a, int b) {
		int temp;
		while (a % b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return b;
	}
}
