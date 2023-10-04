package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            String textNum = Integer.toString(i);

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < textNum.length(); j++) {
                int currentNum = Integer.parseInt(String.valueOf(textNum.charAt(j)));

                if (j % 2 == 0){
                    evenSum += currentNum;
                }else {
                    oddSum += currentNum;
                }
            }

            if (oddSum == evenSum){
                System.out.printf("%d ", i);
            }
        }
    }
}
