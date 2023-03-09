package com.prowings.string;
import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int passwordLength = password.length();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < passwordLength; i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        int strengthScore = 0;

        if (passwordLength >= 8) {
            strengthScore++;
        }

        if (hasUppercase) {
            strengthScore++;
        }

        if (hasLowercase) {
            strengthScore++;
        }

        if (hasDigit) {
            strengthScore++;
        }

        if (hasSpecialChar) {
            strengthScore++;
        }

        String strengthLabel;

        switch (strengthScore) {
            case 1:
                strengthLabel = "Very Weak";
                break;
            case 2:
                strengthLabel = "Weak";
                break;
            case 3:
                strengthLabel = "Moderate";
                break;
            case 4:
                strengthLabel = "Strong";
                break;
            case 5:
                strengthLabel = "Very Strong";
                break;
            default:
                strengthLabel = "Unknown";
        }

        System.out.println("Password strength: " + strengthLabel);
    }
}