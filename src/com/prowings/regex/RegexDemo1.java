package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE); //pattern
		
		Matcher matcher = pattern.matcher("hi Hello how are you!!"); //input
		
		boolean res = matcher.find();
		
		if(res)
			System.out.println("Match found");
		else
			System.out.println("Match not found");
		
		
	}

}
