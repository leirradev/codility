package com.leirra.exam.codility;

public class CountFactors {

	public static void main(String[] args) {
		CountFactors c = new CountFactors();
		int j = 24;
		System.out.println("The number of factors in "+j+" is: "+c.solution(j));
	}
	public int solution(int N) {
        int numFactors = 0;
		for (int i = 1; i <= (double) Math.sqrt(N); i++) {
			if (N % i == 0) {
				if (i * i != N) {
					numFactors = numFactors + 2;
				} else if (i * i == N) {
					numFactors = numFactors + 1;
				}
			}
		}
		return numFactors;
    }
}
