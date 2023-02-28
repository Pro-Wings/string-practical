package com.prowings.string;

public class TestString5 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = "";
		
		String res = s1.concat(s2);
		
		System.out.println(res);
		
		System.out.println(s3 == res);
		
		String res1 = s3.concat(s4);
		
		System.out.println(s3 == res1);
		
	}

}
