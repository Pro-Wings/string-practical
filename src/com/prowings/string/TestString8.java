package com.prowings.string;

public class TestString8 {
	
	public static void main(String[] args) {
		
		String s1 = "hello java developers welcome to java world";
		
//		s1 = s1.replace("java", "python");
		s1 = s1.replaceFirst("java", "python");
		
		System.out.println(s1);
		
	}

}
