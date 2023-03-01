package com.prowings.string;

import java.util.Arrays;

public class TestStringWordAndCharCount {

	public static void main(String[] args) {

		String line = "india is my country india have 27 states india is beautiful";

		String[] words = line.split(" ");
		
		System.out.println("Total number of words : "+words.length);
		int length = 0;
		for(String wrd : words)
		{
			length = length + wrd.length();
		}

		System.out.println("Total number of chars : "+length);
		char[] characters = new char[length];

		int pos = 0;

		for (String word : words) {

			for (char character : word.toCharArray()) // copying elements of secondArray using for-each loop
			{
				characters[pos] = character;
				pos++; // increases position by 1
			}
		}
		System.out.println(Arrays.toString(characters));

	}

}
