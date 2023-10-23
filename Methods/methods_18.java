package Fundamentals.Methods;

import java.util.Scanner;

public class methods_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            int number = Integer.parseInt(input);
            int palindromeNum = palindrome(input);

            System.out.println(isEqual(number,palindromeNum));

            input = scanner.nextLine();
        }
    }

    public static int palindrome (String num){

        String reversed = "";
        for (int i = num.length() -1; i >= 0; i--) {

            reversed += num.charAt(i);
        }

        return Integer.parseInt(reversed);
    }

    public static boolean isEqual (int n1, int n2){

        return n1 == n2;
    }
}