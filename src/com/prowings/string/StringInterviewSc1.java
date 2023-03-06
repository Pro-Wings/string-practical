package com.prowings.string;

public class StringInterviewSc1 {
	
	public static void main(String[] args) {
		
		char[] data = {'h','e','l','l','o'};
		
		String s1 = new String(data);
		
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

}
