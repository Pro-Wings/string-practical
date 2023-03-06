package com.prowings.string;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String input = "Radar";
		
		boolean result = isPalindrome(input);
		
		System.out.println(result);
	}

	private static boolean isPalindrome(String original) {
		
		String reversedString = "";
		
		StringBuffer sb = new StringBuffer(original);
		
		sb.reverse();
		
		reversedString = new String(sb);
		
//		String reversedString = new String(new StringBuffer(original).reverse());
		
		return original.equalsIgnoreCase(reversedString) ? true : false;
		
		
//		return original.equals(new String(new StringBuffer(original).reverse())) ? true : false;

	}



}
