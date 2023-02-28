package com.prowings.string;

public class TestString9 {
	
	public static void main(String[] args) {
		
		String line = "hello java developers welcome to java world";
		
		String[] words = line.split(" ");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
	}

}
