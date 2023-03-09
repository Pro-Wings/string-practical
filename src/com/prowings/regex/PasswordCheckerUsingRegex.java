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

public class PasswordCheckerUsingRegex {
	
	public static void main(String[] args) {
		
		boolean res = isValidPassword("P@ssword123");
		
		if(res)
			System.out.println("Valid Password!!");
		else
			System.out.println("Invalid Password!!");
			
	}

	private static boolean isValidPassword(String inputPwd) {
		

		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"); //pattern
		
		Matcher matcher = pattern.matcher(inputPwd); //input
		
		boolean res = matcher.find();

		return res;
	}

}
