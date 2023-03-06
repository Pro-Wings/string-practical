package com.prowings.stringbuffer;

public class EqualsMethodOnStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuilder sbb1 = new StringBuilder("Hello");
		StringBuilder sbb2 = new StringBuilder("Hello");
		System.out.println(sbb1.equals(sbb2));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1.equals(sb2));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");		
		System.out.println(s1.equals(s2));
	}

}
