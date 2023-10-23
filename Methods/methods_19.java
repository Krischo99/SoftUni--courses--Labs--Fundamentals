package Fundamentals.Methods;

import java.util.Scanner;

public class methods_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if (isDividedByEight(i) && oddDigit(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isDividedByEight(int n1){

        String number = String.valueOf(n1);
        int sumOfDigits = 0;
        for (int i = 0; i < number.length(); i++) {
            sumOfDigits += number.charAt(i);
        }

        return sumOfDigits % 8 == 0;
    }

    public static boolean oddDigit (int n1){

        String number = String.valueOf(n1);
        int oddDigits = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) % 2 != 0){
                oddDigits ++;
            }
        }

        return oddDigits >= 1;
    }
}