package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*The password policy is:

At least 8 chars

Contains at least one digit

Contains at least one lower alpha char and one upper alpha char

Contains at least one char within a set of special chars (@#%$^ etc.)

Does not contain space, tab, etc.
*/

public class EmailCheckerUsingRegex2 {
	
	public static void main(String[] args) {
		
		boolean res = isValidEmail("bob-smith@foo.com");
		
		if(res)
			System.out.println("Valid Email!!");
		else
			System.out.println("Invalid Email!!");
			
	}

	private static boolean isValidEmail(String inputmail) {
		

		Pattern pattern = Pattern.compile("^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,3}$"); //pattern
		
		Matcher matcher = pattern.matcher(inputmail); //input
		
		boolean res = matcher.find();

		return res;
	}

}
