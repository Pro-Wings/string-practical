package com.prowings.string;

public class PasswordStrengthCheker {
	
	
	public static void main(String[] args) {
		
		String password = "abc12@$pqr";
		
		int res = checkPasswordStrength(password);
		
		switch(res)
		{
		case 0 : 
			System.out.println("Weak Password!!");
			break;
		case 1 :
			System.out.println("Medium Password!!");
			break;
		case 2 :
			System.out.println("Strong Password!!");
			break;
		default:
				System.out.println("Invalid Password!!!");
			
		}
		
	}

	private static int checkPasswordStrength(String password) {
		
		if(password.length() <= 8)
		return 9;
		
		char[] pwdChars = password.toCharArray();
		
		int letterCount = 0;
		int digitCount = 0;
		int splCharCount = 0;
		
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

		if((letterCount>=4))
		{
			if(digitCount>=3)
			{
				
			}
			
			
			return 9;
		}
		
		return 1;
	}

}
