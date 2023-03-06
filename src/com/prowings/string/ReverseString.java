package com.prowings.string;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Ram";

		System.out.println(reverse1(input));
		System.out.println(reverse2(input));
		System.out.println(reverse3(input));
	}

	public static String reverse1(String input) {

		StringBuilder reversedInput = new StringBuilder();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversedInput = reversedInput.append(input.charAt(i));
		}

		return new String(reversedInput);
	}

	public static String reverse2(String input) {

		StringBuffer sb = new StringBuffer(input);

//		StringBuffer reversedSb = sb.reverse();

//		String res = new String(reversedSb);

		return new String(sb.reverse());
	}

	public static String reverse3(String input) {

		char[] chars = input.toCharArray();

		char[] result = new char[chars.length];
		int j = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			result[j] = chars[i];
			j++;
		}

		return new String(result);
	}

}
