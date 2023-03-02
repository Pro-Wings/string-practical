package com.prowings.stringbuffer;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		sb1.trimToSize();
		
		System.out.println(sb1.capacity());

		sb1.append("world");
		
		System.out.println(sb1);
		
		String s1 = "hello";
		
		s1.concat("world");
		System.out.println(s1);
		
	}

}
