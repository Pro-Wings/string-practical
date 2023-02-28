package com.prowings.string;

public class TestString3 {
	
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "helloWorld";
		
		System.out.println(">>>>>>>>>length : "+s1.length());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		
		System.out.println(s1.equals(s2)); //content equality
		System.out.println(s1 == s2); //reference equality

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String s5 = "";
		String s6 = null;
		String s7 = "null";
		String s8 = " ";
		
		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank());
		System.out.println(s8.isBlank());
		
		System.out.println(s2.charAt(0));
		
		String str1 = "India";
		String str2 = "india";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str3 = "123Ind12345Best";

		System.out.println(str3.startsWith("Ind", 3));
		System.out.println(str3.endsWith("Best"));
		
		System.out.println(str2.indexOf('z'));
		System.out.println(str2.lastIndexOf('i'));
	}

}
