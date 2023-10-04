package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int countNum = 0;
        boolean enough = false;

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                countNum++;
                System.out.printf("%d ", countNum);
                if (countNum == num){
                    enough = true;
                    break;
                }
            }
            System.out.println();
            if (enough){
                break;
            }
        }
    }
}
