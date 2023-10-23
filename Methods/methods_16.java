package Fundamentals.Methods;

import java.util.Scanner;

public class methods_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean passwordLength = enoughChars(password);
        boolean digitsAndLetters = !checkForLettersAndDigits(password);
        boolean twoDigits = checkFor2Digits(password);

        if (passwordLength && digitsAndLetters && twoDigits){
            System.out.println("Password is valid");
        }
    }

    public static boolean enoughChars (String text){

        if (text.length() >= 6 && text.length() <= 10){
            return true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean checkForLettersAndDigits (String text){

        boolean notDigitOrLetter = false;
        char [] letters = text.toCharArray();
        for (char letter:letters) {
            if (!Character.isLetterOrDigit(letter)){
                System.out.println("Password must consist only of letters and digits");
                return true;
            }
        }

        return  notDigitOrLetter;
    }

    public static boolean checkFor2Digits (String text){

        int countDigits = 0;
        for (int i = 0; i < text.length(); i++) {
            char digit = text.charAt(i);
            if (Character.isDigit(digit)){
                countDigits ++;
            }
        }

        if (countDigits >= 2){
            return true;
        }else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}