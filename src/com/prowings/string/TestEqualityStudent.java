package com.prowings.string;

public class TestEqualityStudent {
	
	public static void main(String[] args) {
		
		ProStudent std1 = new ProStudent(10, "Ram");
		ProStudent std2 = new ProStudent(10, "Ram");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(std1.equals(std2));
		
	}

}
