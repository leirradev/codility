package com.leirra.exam.codility;

public class LongestPassword {
//	it has to contain only alphanumerical characters a to z, A to Z, 0 to 9;
//	there should be an even number of letters;
//	there should be an odd number of digits.
	public static void main(String[] args) {
		LongestPassword l = new LongestPassword();
		String password = "test 5 a0A pass007 ?xy1";
		System.out.println("The longest length of password in sentence below\n(" + password 
				+ ")\nis: " + l.solution(password));
	}

	public int solution(String S) {
		String[] words = S.replaceAll("\\s+", " ").split(" ");
		int maxLength = -1;
		for (String word : words) {
			if (word.matches("^[0-9a-zA-Z]*$") 
				&& word.replaceAll("[0-9]+", "").length() % 2 == 0
				&& word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
				maxLength = Math.max(maxLength, word.length());
			}
		}
		return maxLength;
	}
}
