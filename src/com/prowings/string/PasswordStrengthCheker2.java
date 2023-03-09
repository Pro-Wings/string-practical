package com.prowings.string;

import java.util.Scanner;

public class PasswordStrengthCheker2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password to check strength : ");
		String password = sc.nextLine();
		
		int res = checkPasswordStrength(password);
		
		switch(res)
		{
		case 1 : 
			System.out.println("Very Weak Password!!");
			break;
		case 2 :
			System.out.println("Weak Password!!");
			break;
		case 3 :
			System.out.println("Medium Password!!");
			break;
		case 4 :
			System.out.println("Strong Password!!");
			break;
		default:
				System.out.println("Invalid Password!!!");
			
		}
		
	}

	private static int checkPasswordStrength(String password) {

		char[] pwdChars = password.toCharArray();
		
		int letterCount = 0;
		int digitCount = 0;
		int splCharCount = 0;
		int strengthScore = 0;
		
		if(password.length() >= 8)
			strengthScore++;

		
		for(char c : pwdChars)
		{
			if(Character.isLetter(c))
			{
				letterCount++;
			}
		}

		for(char c : pwdChars)
		{
			if(Character.isDigit(c))
			{
				digitCount++;
			}
		}

		for(char c : pwdChars)
		{
			if(!Character.isDigit(c)
	                && !Character.isLetter(c)
	                && !Character.isWhitespace(c))
			{
				splCharCount++;
			}
		}

        if (letterCount >= 4) {
            strengthScore++;
        }

        if (digitCount >= 3) {
            strengthScore++;
        }

        if (splCharCount >= 1) {
            strengthScore++;
        }
		
		return strengthScore;
	}

}
