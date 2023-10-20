package Fundamentals.Methods;

import java.util.Scanner;

public class methods_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplySums(evenSum(num),oddSum(num)));
    }

    public static int evenSum (int number){

        int numbers = Math.abs(number);
        String num = String.valueOf(numbers);
        int evenDigitSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (currentNum % 2 == 0){
                evenDigitSum += currentNum;
            }
        }

        return evenDigitSum;
    }

    public static int oddSum (int number){

        int numbers = Math.abs(number);
        String num = String.valueOf(numbers);
        int oddDigitSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (currentNum % 2 != 0){
                oddDigitSum += currentNum;
            }
        }

        return oddDigitSum;
    }

    public static int multiplySums (int odd, int even){

        return odd * even;
    }
}