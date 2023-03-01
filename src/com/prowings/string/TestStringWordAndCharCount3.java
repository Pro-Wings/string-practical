package com.prowings.string;

import java.util.Arrays;

public class TestStringWordAndCharCount3 {

	public static void main(String[] args) {

		String line = "india is my country india have 27 states";
		
		String lineWithoutSpace = line.replace(" ", "");

		String[] words = line.split(" ");
		
		char[] characters = new char[lineWithoutSpace.length()];

		int preWrdLenght = 0;
		for(String word : words)
		{
			System.arraycopy(word.toCharArray(), 0, characters, preWrdLenght, word.length());
			preWrdLenght += word.length();		
		}

		System.out.println(Arrays.toString(characters));

	}

}
