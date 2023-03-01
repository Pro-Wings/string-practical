package com.prowings.string;

public class WordOccurance {
	
	public static void main(String[] args) {
		
		String line = "india is my country india have 27 states india is beautiful";

		String[] words = line.split(" ");

		int wordCount = 0;
		
		for(int i=0; i<words.length; i++)
		{
			
			for(int j=0; j<words.length; j++)
			{
				
				if(words[i].equals(words[j]))
				{
					wordCount++;
				}
				
			}
			
			System.out.println(words[i] +" occurred "+ wordCount +" times");
			wordCount = 0;
		}
		
	}

}
