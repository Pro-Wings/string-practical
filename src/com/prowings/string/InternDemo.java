package com.prowings.string;

public class InternDemo {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println(s1 == s3);
	
		s3 = s3.intern();
		
		System.out.println(s1 == s3);
		
		
	}

}
