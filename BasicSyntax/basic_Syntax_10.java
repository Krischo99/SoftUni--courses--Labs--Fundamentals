package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLetters = Integer.parseInt(scanner.nextLine());
        String whichNum = "";
        String message = "";

        for (int i = 0; i < numLetters; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            String number = String.valueOf(num);
            int numOfNum = number.length();
            char letter = number.charAt(0);

            if (letter == '0') {
                whichNum = " ";
            } else if (letter == '2') {
                whichNum = "abc";
            } else if (letter == '3') {
                whichNum = "def";
            } else if (letter == '4') {
                whichNum = "ghi";
            } else if (letter == '5') {
                whichNum = "jkl";
            } else if (letter == '6') {
                whichNum = "mno";
            } else if (letter == '7') {
                whichNum = "pqrs";
            } else if (letter == '8') {
                whichNum = "tuv";
            } else if (letter == '9') {
                whichNum = "wxyz";
            }

            message += String.valueOf(whichNum.charAt(numOfNum - 1));
        }
        System.out.println(message);
    }
}