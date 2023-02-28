package com.prowings.string;

public class TestString7 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = "";
		
		String res = s1+s2;
		
		System.out.println(res);
		
		System.out.println(s3 == res);
		
		String res1 = s3+s4;
		
		System.out.println(s3 == res1);
		
		String str1 = "mesquite";
		
		System.out.println(str1.replace('e', 'o'));
		
	}

}
