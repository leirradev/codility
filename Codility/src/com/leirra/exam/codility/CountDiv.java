package com.leirra.exam.codility;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv c = new CountDiv();
		int i=6
		,j=11
		,k=2;
		System.out.println("Numbers "+i+" to "+j+" that divisible by "+k+" is " +c.solution(i, j, k));
	}

	public int solution(int A, int B, int K) {
		int offsetForLeftRange = 0;
		if (A % K == 0)
			++offsetForLeftRange;
		return (B / K) - (A / K) + offsetForLeftRange;
	}
}
