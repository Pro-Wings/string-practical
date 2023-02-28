package com.prowings.string;

public class TestString2 {
	
	public static void main(String[] args) {
		
		String s1 = new String("helloworld");
		String s2 = "hello";
		String s3 = "world";
		String s4 = s2.concat(s3);
		String s5 = "helloworld";
		String s6 = s2 + s3;
		
		
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);
		System.out.println(s1 == s5);
		System.out.println(s5 == s6);
	}

}
