package com.prowings.string;

import java.util.Arrays;

public class TestStringWordAndCharCount2 {

	public static void main(String[] args) {

		String line = "india is my country india have 27 states";
		
		String[] words = line.split(" ");
		
		System.out.println("Total number of words : "+words.length);
		
		String lineWithoutSpace = line.replace(" ", "");
		
		System.out.println("Total number of chars : "+lineWithoutSpace.length());

		char[] characters = lineWithoutSpace.toCharArray();
		
		System.out.println(Arrays.toString(characters));
		
	}

}
