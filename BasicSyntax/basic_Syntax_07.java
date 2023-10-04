package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String number = Integer.toString(num);
        int sumOfFactoriel = 0;

        for (int i = 0; i < number.length(); i++) {
            int num2 = Integer.parseInt(String.valueOf(number.charAt(i)));
            int currentNumOfFactoriel = 1;
            for (int j = 1; j <= num2; j++) {
                currentNumOfFactoriel *= j;
            }
            sumOfFactoriel += currentNumOfFactoriel;
        }

        if (sumOfFactoriel == num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
